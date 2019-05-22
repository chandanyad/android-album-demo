package com.album.demo.modules.album.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/album/demo/modules/album/ui/AlbumActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/album/demo/modules/album/ui/AlbumContracts$View;", "()V", "linearLayoutManager", "Landroid/support/v7/widget/LinearLayoutManager;", "presenter", "Lcom/album/demo/modules/album/ui/AlbumContracts$Presenter;", "getPresenter", "()Lcom/album/demo/modules/album/ui/AlbumContracts$Presenter;", "setPresenter", "(Lcom/album/demo/modules/album/ui/AlbumContracts$Presenter;)V", "fetchData", "", "initDagger", "loadUI", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onError", "onFetchComplete", "updateAlbumList", "viewModel", "Lcom/album/demo/modules/album/ui/AlbumViewModel;", "app_debug"})
public final class AlbumActivity extends android.support.v7.app.AppCompatActivity implements com.album.demo.modules.album.ui.AlbumContracts.View {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.album.demo.modules.album.ui.AlbumContracts.Presenter presenter;
    private android.support.v7.widget.LinearLayoutManager linearLayoutManager;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.album.demo.modules.album.ui.AlbumContracts.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.album.demo.modules.album.ui.AlbumContracts.Presenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initDagger() {
    }
    
    private final void loadUI() {
    }
    
    private final void fetchData() {
    }
    
    @java.lang.Override()
    public void onError() {
    }
    
    /**
     * Update the Recycle view with the adapter
     */
    @java.lang.Override()
    public void updateAlbumList(@org.jetbrains.annotations.NotNull()
    com.album.demo.modules.album.ui.AlbumViewModel viewModel) {
    }
    
    @java.lang.Override()
    public void onFetchComplete() {
    }
    
    public AlbumActivity() {
        super();
    }
}