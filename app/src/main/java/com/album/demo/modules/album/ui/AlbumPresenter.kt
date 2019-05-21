package com.album.demo.modules.album.ui

import android.util.Log
import com.album.demo.modules.album.domain.AlbumServiceContract
import com.album.demo.modules.album.domain.models.Album
import io.reactivex.Observable
import io.reactivex.observers.DisposableObserver

class AlbumPresenter(
    private val view: AlbumContracts.View,
    private val albumServiceContract: AlbumServiceContract
) : AlbumContracts.Presenter {

    override fun getAlbums() {
        albumServiceContract.getAlbumList()
            .subscribe(object : DisposableObserver<List<Album>>() {
                override fun onNext(t: List<Album>) {
                    view.updateAlbumList(AlbumViewModel(t)) // Convert the domain model into view model
                }

                override fun onError(e: Throwable) {
                    view.onError()
                }

                override fun onComplete() {
                    Log.d("Album Fetched", "")
                }
            })
    }
}