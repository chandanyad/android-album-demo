package com.album.demo.modules.album.ui

import com.album.demo.modules.album.domain.models.Album

/**
 * DTO representing the view model and holds the data to be shown on the UI
 */
data class AlbumViewModel(val albumList: List<Album>)