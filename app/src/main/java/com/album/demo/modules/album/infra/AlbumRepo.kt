package com.album.demo.modules.album.infra

import android.util.Log
import com.album.demo.exceptions.NoDataFoundException
import com.album.demo.modules.album.domain.models.Album
import com.album.demo.modules.album.domain.repo.AlbumRepoContract
import io.reactivex.Observable
import io.reactivex.ObservableEmitter
import io.reactivex.observers.DisposableObserver

/**
 * Implementation of [AlbumRepoContract]
 */
class AlbumRepo(
    private val localDataSourceContract: AlbumDataSourceContract,
    private val remoteDataSourceContract: AlbumDataSourceContract
) : AlbumRepoContract {

    override fun getAlbums(): Observable<List<Album>> {
        return Observable.create {
            getFromLocalDB(it) // Start with local Data source
        }
    }

    /**
     * Get the data from the Local Data source
     */
    private fun getFromLocalDB(emitter: ObservableEmitter<List<Album>>) {
        localDataSourceContract.getAlbums()
            .subscribe(object : DisposableObserver<List<Album>>() {
                override fun onNext(t: List<Album>) {
                    if (t.isNullOrEmpty()) {
                        onError(NoDataFoundException())
                    } else {
                        emitter.onNext(t) // Send data back in stream
                    }
                }

                override fun onError(e: Throwable) {
                    getFromRemote(emitter) // In case of exception from the Local data source, fetch from the API
                }

                override fun onComplete() = emitter.onComplete()
            })
    }

    /**
     * Get the data from the Remote Data source
     */
    private fun getFromRemote(emitter: ObservableEmitter<List<Album>>) {
        remoteDataSourceContract.getAlbums()
            .subscribe(object : DisposableObserver<List<Album>>() {
                override fun onNext(t: List<Album>) {
                    if (t.isNullOrEmpty()) {
                        onError(NoDataFoundException())
                    } else {
                        emitter.onNext(t)// Send data back in stream
                        localDataSourceContract.saveAlbums(t) // cache it for later Use
                    }
                }

                override fun onError(e: Throwable) = emitter.onError(NoDataFoundException())
                override fun onComplete() = emitter.onComplete()
            })
    }
}