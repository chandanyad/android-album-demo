package com.album.demo.modules.album.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/album/demo/modules/album/ui/AlbumContracts;", "", "()V", "Presenter", "View", "app_debug"})
public final class AlbumContracts {
    
    public AlbumContracts() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/album/demo/modules/album/ui/AlbumContracts$View;", "", "onError", "", "onFetchComplete", "updateAlbumList", "viewModel", "Lcom/album/demo/modules/album/ui/AlbumViewModel;", "app_debug"})
    public static abstract interface View {
        
        public abstract void updateAlbumList(@org.jetbrains.annotations.NotNull()
        com.album.demo.modules.album.ui.AlbumViewModel viewModel);
        
        public abstract void onFetchComplete();
        
        public abstract void onError();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/album/demo/modules/album/ui/AlbumContracts$Presenter;", "", "getAlbums", "", "app_debug"})
    public static abstract interface Presenter {
        
        public abstract void getAlbums();
    }
}