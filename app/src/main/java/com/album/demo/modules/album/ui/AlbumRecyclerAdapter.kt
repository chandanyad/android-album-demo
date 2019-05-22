package com.album.demo.modules.album.ui

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.album.demo.R
import com.album.demo.modules.album.domain.models.Album

class AlbumRecyclerAdapter(private val albumList: List<Album>, private val context: Context) :
    RecyclerView.Adapter<AlbumRecyclerAdapter.AlbumHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): AlbumHolder {
        val inflater = LayoutInflater.from(p0.context)
        return AlbumHolder(inflater.inflate(R.layout.recycle_item, p0, false))
    }

    override fun getItemCount(): Int {
        return albumList.size
    }

    override fun onBindViewHolder(p0: AlbumHolder, p1: Int) {
        p0.bind(albumList.get(p1), context)
    }


    class AlbumHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var titleView: TextView
        private var idView: TextView
        private var userIDView: TextView

        init {
            itemView.apply {
                titleView = findViewById(R.id.title)
                idView = findViewById(R.id.id)
                userIDView = findViewById(R.id.user_id)
            }
        }

        fun bind(album: Album, context: Context) {
            with(album) {
                idView.text = context.getString(R.string.id_text, id.toString())
                titleView.text = context.getString(R.string.title_text, title)
                userIDView.text = context.getString(R.string.user_id_text, userId)
            }

        }
    }
}

