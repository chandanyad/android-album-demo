package com.album.demo.modules.album.infra.local

import com.album.demo.modules.album.domain.models.Album
import com.album.demo.modules.album.domain.repo.AlbumRepoContract
import com.album.demo.modules.album.infra.AlbumDataSourceContract
import io.reactivex.Observable
import java.lang.UnsupportedOperationException

/**
 * Implementation of [AlbumDataSourceContract]
 */
class AlbumLocalDS() : AlbumDataSourceContract {

    override fun getAlbums(): Observable<List<Album>> {
        return Observable.error(UnsupportedOperationException())
    }

    override fun saveAlbums(albumList: List<Album>) {

    }
}