package com.album.demo.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0006H\u0007J\u001c\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0015\u001a\u00020\n2\b\b\u0001\u0010\u0016\u001a\u00020\nH\u0007J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0014H\u0007J\b\u0010\u0019\u001a\u00020\u000eH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/album/demo/di/module/AlbumModule;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "provideAlbumApi", "Lcom/album/demo/modules/album/infra/remote/AlbumApi;", "retrofit", "Lretrofit2/Retrofit;", "provideAlbumLocalDS", "Lcom/album/demo/modules/album/infra/AlbumDataSourceContract;", "provideAlbumPresenter", "Lcom/album/demo/modules/album/ui/AlbumContracts$Presenter;", "view", "Lcom/album/demo/modules/album/ui/AlbumContracts$View;", "albumServiceContract", "Lcom/album/demo/modules/album/domain/AlbumServiceContract;", "provideAlbumRemoteDS", "api", "provideAlbumRepo", "Lcom/album/demo/modules/album/domain/repo/AlbumRepoContract;", "localDataSourceContract", "remoteDataSourceContract", "provideAlbumService", "repoContract", "provideAlbumView", "app_debug"})
@dagger.Module()
public final class AlbumModule {
    private android.app.Activity activity;
    
    @org.jetbrains.annotations.NotNull()
    @com.album.demo.di.scope.AlbumScreenScope()
    @dagger.Provides()
    public final com.album.demo.modules.album.ui.AlbumContracts.View provideAlbumView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.album.demo.di.scope.AlbumScreenScope()
    @dagger.Provides()
    public final com.album.demo.modules.album.ui.AlbumContracts.Presenter provideAlbumPresenter(@org.jetbrains.annotations.NotNull()
    com.album.demo.modules.album.ui.AlbumContracts.View view, @org.jetbrains.annotations.NotNull()
    com.album.demo.modules.album.domain.AlbumServiceContract albumServiceContract) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.album.demo.di.scope.AlbumScreenScope()
    @dagger.Provides()
    public final com.album.demo.modules.album.domain.AlbumServiceContract provideAlbumService(@org.jetbrains.annotations.NotNull()
    com.album.demo.modules.album.domain.repo.AlbumRepoContract repoContract) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.album.demo.di.scope.AlbumScreenScope()
    @dagger.Provides()
    public final com.album.demo.modules.album.domain.repo.AlbumRepoContract provideAlbumRepo(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "REMOTE_DS")
    com.album.demo.modules.album.infra.AlbumDataSourceContract localDataSourceContract, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "REMOTE_DS")
    com.album.demo.modules.album.infra.AlbumDataSourceContract remoteDataSourceContract) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "LOCAL_DS")
    @com.album.demo.di.scope.AlbumScreenScope()
    @dagger.Provides()
    public final com.album.demo.modules.album.infra.AlbumDataSourceContract provideAlbumLocalDS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "REMOTE_DS")
    @com.album.demo.di.scope.AlbumScreenScope()
    @dagger.Provides()
    public final com.album.demo.modules.album.infra.AlbumDataSourceContract provideAlbumRemoteDS(@org.jetbrains.annotations.NotNull()
    com.album.demo.modules.album.infra.remote.AlbumApi api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.album.demo.di.scope.AlbumScreenScope()
    @dagger.Provides()
    public final com.album.demo.modules.album.infra.remote.AlbumApi provideAlbumApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    public AlbumModule(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
}