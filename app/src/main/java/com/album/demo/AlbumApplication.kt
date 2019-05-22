package com.album.demo

import android.app.Application
import com.album.demo.di.component.ApplicationComponent
import com.album.demo.di.component.DaggerApplicationComponent
import com.album.demo.di.module.DBModule
import com.album.demo.di.module.NetworkModule
import io.realm.Realm
import javax.inject.Inject

class AlbumApplication : Application() {
    lateinit var applicationComponent: ApplicationComponent

    @Inject
    lateinit var realm: Realm

    override fun onCreate() {
        super.onCreate()

        initDagger()
    }

    /**
     * Init the application level dependency
     */
    private fun initDagger() {
        applicationComponent = DaggerApplicationComponent.builder()
            .networkModule(NetworkModule())
            .dBModule(DBModule(this))
            .build()

        applicationComponent.inject(this)
    }

    override fun onTerminate() {
        super.onTerminate()
        realm.close()
    }
}