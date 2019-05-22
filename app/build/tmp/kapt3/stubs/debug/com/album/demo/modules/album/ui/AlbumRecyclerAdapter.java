package com.album.demo.modules.album.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/album/demo/modules/album/ui/AlbumRecyclerAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/album/demo/modules/album/ui/AlbumRecyclerAdapter$AlbumHolder;", "albumList", "", "Lcom/album/demo/modules/album/domain/models/Album;", "context", "Landroid/content/Context;", "(Ljava/util/List;Landroid/content/Context;)V", "getItemCount", "", "onBindViewHolder", "", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "AlbumHolder", "app_debug"})
public final class AlbumRecyclerAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.album.demo.modules.album.ui.AlbumRecyclerAdapter.AlbumHolder> {
    private final java.util.List<com.album.demo.modules.album.domain.models.Album> albumList = null;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.album.demo.modules.album.ui.AlbumRecyclerAdapter.AlbumHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.album.demo.modules.album.ui.AlbumRecyclerAdapter.AlbumHolder p0, int p1) {
    }
    
    public AlbumRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.album.demo.modules.album.domain.models.Album> albumList, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/album/demo/modules/album/ui/AlbumRecyclerAdapter$AlbumHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "idView", "Landroid/widget/TextView;", "titleView", "userIDView", "bind", "", "album", "Lcom/album/demo/modules/album/domain/models/Album;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class AlbumHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        private android.widget.TextView titleView;
        private android.widget.TextView idView;
        private android.widget.TextView userIDView;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.album.demo.modules.album.domain.models.Album album, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        public AlbumHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}