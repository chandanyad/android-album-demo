package com.album.demo.modules.album.infra.local

import android.util.Log
import com.album.demo.exceptions.NoDataFoundException
import com.album.demo.modules.album.domain.models.Album
import com.album.demo.modules.album.infra.AlbumDataSourceContract
import com.album.demo.modules.album.infra.local.model.ROAlbum
import io.reactivex.Observable
import io.realm.Realm
import io.realm.RealmResults
import java.util.*


/**
 * Implementation of [AlbumDataSourceContract]
 */
class AlbumLocalDS(private var mRealm: Realm) : AlbumDataSourceContract {
    private val stalePeriod = 1 * 15 * 1000 // 1 minute

    override fun getAlbums(): Observable<List<Album>> {
        return Observable.create { emitter ->
            // Delete the stale records before proceeding insert or Update
            deleteIfStaleRecordsExists(mRealm)

            mRealm.where(ROAlbum::class.java)?.let {

                // Get the album list
                val queryResult: RealmResults<ROAlbum> = it.findAll()

                if (queryResult.isNullOrEmpty()) {
                    emitter.onError(NoDataFoundException()) // Throw exception if no data found
                } else {
                    Log.d(AlbumLocalDS::class.java.simpleName, " Album count from DB : " + queryResult.size)
                    val albumList = mutableListOf<Album>()
                    queryResult.forEach {
                        albumList.add(it.convertToDomainModel()) // convert ROModel into Domain Model
                    }

                    // Send back to the stream
                    emitter.onNext(albumList.toList())
                }
                emitter.onComplete()
            }
        }
    }

    override fun saveAlbums(albumList: List<Album>) {
        // Asynchronously update objects on a background thread
        mRealm.executeTransactionAsync({ realm ->
            // Delete the stale records before proceeding insert or Update
            deleteIfStaleRecordsExists(realm)

            albumList.forEach {
                val roAlbum = ROAlbum()
                with(roAlbum) {
                    title = it.title
                    id = it.id
                    userId = it.userId
                }
                realm.insertOrUpdate(roAlbum)
            }
        }, {
            Log.d(AlbumLocalDS::class.java.simpleName, " Album DB Insert Successful!!")
        }, {
            Log.d(AlbumLocalDS::class.java.simpleName, " Album DB Insert Failed !!" + it.message)
        })
    }


    /**
     * Get all the stale records to be removed.
     */
    private fun deleteIfStaleRecordsExists(realm: Realm) {
        val staleRecord: RealmResults<ROAlbum>? = realm.where(ROAlbum::class.java)
            .lessThan("lastSyncDate", Date(System.currentTimeMillis() - stalePeriod))
            .findAll()

        // Delete all the stale records
        staleRecord?.let { records ->
            if (staleRecord.isNotEmpty()) {
                realm.executeTransaction {
                    records.deleteAllFromRealm()
                    Log.d(AlbumLocalDS::class.java.simpleName, records.size.toString() + " records deleted !!")
                }
            }
        }
    }

}