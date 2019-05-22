package com.album.demo.modules.album.domain;

import java.lang.System;

/**
 * AlbumResponse service contract to get all album list from the dara repository
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/album/demo/modules/album/domain/AlbumServiceContract;", "", "getAlbumList", "Lio/reactivex/Observable;", "", "Lcom/album/demo/modules/album/domain/models/Album;", "app_debug"})
public abstract interface AlbumServiceContract {
    
    /**
     * Get all the album list
     *
     * @return Observable of {list of [Album]}
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<com.album.demo.modules.album.domain.models.Album>> getAlbumList();
}