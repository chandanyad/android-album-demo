package com.album.demo.modules.album.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View.GONE
import android.view.View.VISIBLE
import com.album.demo.AlbumApplication
import com.album.demo.R
import com.album.demo.di.component.DaggerScreenComponent
import com.album.demo.di.module.AlbumModule
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class AlbumActivity : AppCompatActivity(), AlbumContracts.View {
    @Inject
    lateinit var presenter: AlbumContracts.Presenter
    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDagger()
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
        setContentView(R.layout.activity_main)

        // RecyclerView node initialized here
        recycleView.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(this@AlbumActivity)
        }

        refreshButton.setOnClickListener { fetchData() }

        fetchData()
    }

    private fun fetchData() {
        progressBar.visibility = VISIBLE
        recycleViewLayout.visibility = GONE
        retry_button.visibility = GONE
        presenter.getAlbums()
    }


    override fun onError() {
        progressBar.visibility = GONE
        recycleViewLayout.visibility = GONE
        retry_button.visibility = VISIBLE
    }

    /**
     * Update the Recycle view with the adapter
     */
    override fun updateAlbumList(viewModel: AlbumViewModel) {
        // RecyclerView node initialized here
        viewModel.apply {
            albumList.sortedBy { it.title }
        }.run {
            // set the custom adapter to the RecyclerView
            recycleView.adapter = AlbumRecyclerAdapter(albumList, this@AlbumActivity)
        }
    }

    override fun onFetchComplete() {
        progressBar.visibility = GONE
        recycleViewLayout.visibility = VISIBLE
        retry_button.visibility = GONE
    }
}
