package com.album.demo.modules.album.infra;

import java.lang.System;

/**
 * Implementation of [AlbumRepoContract]
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0016J\u001c\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\rH\u0002J\u001c\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/album/demo/modules/album/infra/AlbumRepo;", "Lcom/album/demo/modules/album/domain/repo/AlbumRepoContract;", "remoteDataSourceContract", "Lcom/album/demo/modules/album/infra/AlbumDataSourceContract;", "localDataSourceContract", "(Lcom/album/demo/modules/album/infra/AlbumDataSourceContract;Lcom/album/demo/modules/album/infra/AlbumDataSourceContract;)V", "getAlbums", "Lio/reactivex/Observable;", "", "Lcom/album/demo/modules/album/domain/models/Album;", "getFromLocalDB", "", "emitter", "Lio/reactivex/ObservableEmitter;", "getFromRemote", "app_debug"})
public final class AlbumRepo implements com.album.demo.modules.album.domain.repo.AlbumRepoContract {
    private final com.album.demo.modules.album.infra.AlbumDataSourceContract remoteDataSourceContract = null;
    private final com.album.demo.modules.album.infra.AlbumDataSourceContract localDataSourceContract = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.album.demo.modules.album.domain.models.Album>> getAlbums() {
        return null;
    }
    
    /**
     * Get the data from the Local Data source
     */
    private final void getFromLocalDB(io.reactivex.ObservableEmitter<java.util.List<com.album.demo.modules.album.domain.models.Album>> emitter) {
    }
    
    /**
     * Get the data from the Remote Data source
     */
    private final void getFromRemote(io.reactivex.ObservableEmitter<java.util.List<com.album.demo.modules.album.domain.models.Album>> emitter) {
    }
    
    public AlbumRepo(@org.jetbrains.annotations.NotNull()
    com.album.demo.modules.album.infra.AlbumDataSourceContract remoteDataSourceContract, @org.jetbrains.annotations.NotNull()
    com.album.demo.modules.album.infra.AlbumDataSourceContract localDataSourceContract) {
        super();
    }
}