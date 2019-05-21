package com.album.demo.modules.album.ui

class AlbumContracts {
    interface View {
        fun updateAlbumList(viewModel: AlbumViewModel)

        fun onFetchComplete()

        fun onError()
    }

    interface Presenter {
        fun getAlbums()
    }
}