package com.album.demo.modules.album.domain

import com.album.demo.modules.album.domain.models.Album
import io.reactivex.Observable

/**
 * AlbumResponse service contract to get all album list from the dara repository
 */
interface AlbumServiceContract {

    /**
     * Get all the album list
     *
     * @return Observable of {list of [Album]}
     */
    fun getAlbumList(): Observable<List<Album>>
}