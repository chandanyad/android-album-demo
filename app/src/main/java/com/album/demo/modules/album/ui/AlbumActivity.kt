package com.album.demo.modules.album.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.album.demo.AlbumApplication
import com.album.demo.R
import com.album.demo.di.component.DaggerScreenComponent
import com.album.demo.di.module.AlbumModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class AlbumActivity : AppCompatActivity(), AlbumContracts.View {
    @Inject
    lateinit var presenter: AlbumContracts.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDagger()


        setContentView(R.layout.activity_main)
        txt.setOnClickListener { loadUI() }
        loadUI()

    }

    private fun initDagger() {
        DaggerScreenComponent.builder()
            .albumModule(AlbumModule(this))
            .applicationComponent((applicationContext as AlbumApplication).applicationComponent)
            .build()
            .inject(this)
    }

    private fun loadUI() {
        presenter.getAlbums()
    }

    override fun onError() {
    }

    override fun updateAlbumList(viewModel: AlbumViewModel) {
        viewModel.toString()
    }

    override fun onFetchComplete() {

    }
}
