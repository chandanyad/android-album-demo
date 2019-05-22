package com.album.demo.modules.album.domain;

import java.lang.System;

/**
 * Implementation of [AlbumServiceContract]
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/album/demo/modules/album/domain/AlbumService;", "Lcom/album/demo/modules/album/domain/AlbumServiceContract;", "repoContract", "Lcom/album/demo/modules/album/domain/repo/AlbumRepoContract;", "(Lcom/album/demo/modules/album/domain/repo/AlbumRepoContract;)V", "getAlbumList", "Lio/reactivex/Observable;", "", "Lcom/album/demo/modules/album/domain/models/Album;", "app_debug"})
public final class AlbumService implements com.album.demo.modules.album.domain.AlbumServiceContract {
    private final com.album.demo.modules.album.domain.repo.AlbumRepoContract repoContract = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.album.demo.modules.album.domain.models.Album>> getAlbumList() {
        return null;
    }
    
    public AlbumService(@org.jetbrains.annotations.NotNull()
    com.album.demo.modules.album.domain.repo.AlbumRepoContract repoContract) {
        super();
    }
}