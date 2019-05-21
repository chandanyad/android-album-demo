package com.album.demo.modules.album.infra.remote

import com.album.demo.modules.album.infra.remote.model.AlbumResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface AlbumApi {
    @GET("/albums")
    fun fetchAlbums(): Observable<List<AlbumResponse>>
}