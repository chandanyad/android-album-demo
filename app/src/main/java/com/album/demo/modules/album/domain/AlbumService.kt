package com.album.demo.modules.album.domain

import com.album.demo.exceptions.NoDataFoundException
import com.album.demo.modules.album.domain.models.Album
import com.album.demo.modules.album.domain.repo.AlbumRepoContract
import io.reactivex.Observable
import io.reactivex.ObservableEmitter
import io.reactivex.observers.DisposableObserver

/**
 * Implementation of [AlbumServiceContract]
 */
class AlbumService(private val repoContract: AlbumRepoContract) : AlbumServiceContract {

    override fun getAlbumList(): Observable<List<Album>> {
        return Observable.create {
            // Subscribe the Repo to get the data from the Data source stream
            repoContract.getAlbums()
                .subscribe(object : DisposableObserver<List<Album>>() {
                    override fun onNext(t: List<Album>) {
                        if (t.isNullOrEmpty()) {
                            onError(NoDataFoundException())
                        } else {
                            it.onNext(t) // Send data back in stream
                        }
                    }

                    override fun onError(e: Throwable) = it.onError(e)
                    override fun onComplete() = it.onComplete()
                })
        }
    }
}