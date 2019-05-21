package com.album.demo.modules.album.domain.repo

import com.album.demo.modules.album.domain.models.Album
import io.reactivex.Observable

/**
 * AlbumResponse Repository contract to get all album list from the data source.
 * As a part of infrastructure, this need to be implemented by the Repo
 */
interface AlbumRepoContract {

    /**
     * Get all the album list
     *
     * @return Observable of {list of [Album]}
     */
    fun getAlbums(): Observable<List<Album>>
}