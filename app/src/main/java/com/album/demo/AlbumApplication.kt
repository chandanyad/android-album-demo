package com.album.demo

import android.app.Application
import android.content.Context
import com.album.demo.di.component.ApplicationComponent
import com.album.demo.di.component.DaggerApplicationComponent
import com.album.demo.di.module.DBModule
import com.album.demo.di.module.NetworkModule

class AlbumApplication : Application() {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        initDagger()

        if (BuildConfig.DEBUG) {
            // Maybe TimberPlant etc.
        }
    }

    private fun initDagger() {
        applicationComponent = DaggerApplicationComponent.builder()
            .networkModule(NetworkModule())
            .dBModule(DBModule(this)).build()

        applicationComponent.inject(this)
    }
}