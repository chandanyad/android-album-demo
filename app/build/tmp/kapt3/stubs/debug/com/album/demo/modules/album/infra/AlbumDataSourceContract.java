package com.album.demo.modules.album.infra;

import java.lang.System;

/**
 * AlbumResponse Repository contract to get all album list from the data source.
 * As a part of infrastructure, this need to be implemented by the Repo
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&\u00a8\u0006\t"}, d2 = {"Lcom/album/demo/modules/album/infra/AlbumDataSourceContract;", "", "getAlbums", "Lio/reactivex/Observable;", "", "Lcom/album/demo/modules/album/domain/models/Album;", "saveAlbums", "", "albumList", "app_debug"})
public abstract interface AlbumDataSourceContract {
    
    /**
     * Get all the album list
     *
     * @return Observable of {list of [Album]}
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<com.album.demo.modules.album.domain.models.Album>> getAlbums();
    
    /**
     * Save the list of Album to the data source
     */
    public abstract void saveAlbums(@org.jetbrains.annotations.NotNull()
    java.util.List<com.album.demo.modules.album.domain.models.Album> albumList);
}