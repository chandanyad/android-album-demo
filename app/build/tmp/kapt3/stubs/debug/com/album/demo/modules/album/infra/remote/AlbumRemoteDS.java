package com.album.demo.modules.album.infra.remote;

import java.lang.System;

/**
 * Implementation of [AlbumDataSourceContract]
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0002J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000bH\u0016J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/album/demo/modules/album/infra/remote/AlbumRemoteDS;", "Lcom/album/demo/modules/album/infra/AlbumDataSourceContract;", "api", "Lcom/album/demo/modules/album/infra/remote/AlbumApi;", "(Lcom/album/demo/modules/album/infra/remote/AlbumApi;)V", "convertAPiResponseToDomain", "", "Lcom/album/demo/modules/album/domain/models/Album;", "list", "Lcom/album/demo/modules/album/infra/remote/model/AlbumResponse;", "getAlbums", "Lio/reactivex/Observable;", "saveAlbums", "", "albumList", "app_debug"})
public final class AlbumRemoteDS implements com.album.demo.modules.album.infra.AlbumDataSourceContract {
    private final com.album.demo.modules.album.infra.remote.AlbumApi api = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.album.demo.modules.album.domain.models.Album>> getAlbums() {
        return null;
    }
    
    /**
     * Convert the API resonse model into the domain model and also validate the values
     */
    private final java.util.List<com.album.demo.modules.album.domain.models.Album> convertAPiResponseToDomain(java.util.List<com.album.demo.modules.album.infra.remote.model.AlbumResponse> list) {
        return null;
    }
    
    @java.lang.Override()
    public void saveAlbums(@org.jetbrains.annotations.NotNull()
    java.util.List<com.album.demo.modules.album.domain.models.Album> albumList) {
    }
    
    public AlbumRemoteDS(@org.jetbrains.annotations.NotNull()
    com.album.demo.modules.album.infra.remote.AlbumApi api) {
        super();
    }
}