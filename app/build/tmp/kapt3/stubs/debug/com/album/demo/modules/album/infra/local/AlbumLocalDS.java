package com.album.demo.modules.album.infra.local;

import java.lang.System;

/**
 * Implementation of [AlbumDataSourceContract]
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/album/demo/modules/album/infra/local/AlbumLocalDS;", "Lcom/album/demo/modules/album/infra/AlbumDataSourceContract;", "()V", "getAlbums", "Lio/reactivex/Observable;", "", "Lcom/album/demo/modules/album/domain/models/Album;", "saveAlbums", "", "albumList", "app_debug"})
public final class AlbumLocalDS implements com.album.demo.modules.album.infra.AlbumDataSourceContract {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.album.demo.modules.album.domain.models.Album>> getAlbums() {
        return null;
    }
    
    @java.lang.Override()
    public void saveAlbums(@org.jetbrains.annotations.NotNull()
    java.util.List<com.album.demo.modules.album.domain.models.Album> albumList) {
    }
    
    public AlbumLocalDS() {
        super();
    }
}