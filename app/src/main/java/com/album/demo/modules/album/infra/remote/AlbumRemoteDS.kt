package com.album.demo.modules.album.infra.remote

import com.album.demo.exceptions.APIException
import com.album.demo.modules.album.domain.models.Album
import com.album.demo.modules.album.infra.AlbumDataSourceContract
import com.album.demo.modules.album.infra.remote.model.AlbumResponse
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

/**
 * Implementation of [AlbumDataSourceContract]
 */
class AlbumRemoteDS(private val api: AlbumApi) : AlbumDataSourceContract {

    override fun getAlbums(): Observable<List<Album>> {
        return Observable.create { emitter ->
            api.fetchAlbums()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object : DisposableObserver<List<AlbumResponse>>() {
                    override fun onNext(t: List<AlbumResponse>) {
                        emitter.onNext(convertAPiResponseToDomain(t))
                        onComplete()
                    }

                    override fun onError(e: Throwable) {
                        emitter.onError(APIException())
                        onComplete()
                    }
                    override fun onComplete() = emitter.onComplete()
                })
        }
    }

    /**
     * Convert the API response model into the domain model and also validate the values
     */
    private fun convertAPiResponseToDomain(list: List<AlbumResponse>): List<Album> {
        val domainResponseList = mutableListOf<Album>()
        list.forEach {
            domainResponseList.add(Album(userId = it.userId, id = it.id.toInt(), title = it.title))
        }
        return domainResponseList
    }

    override fun saveAlbums(albumList: List<Album>) {
        throw UnsupportedOperationException()
    }
}