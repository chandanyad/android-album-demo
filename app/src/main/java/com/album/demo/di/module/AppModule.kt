package com.album.demo.di.module

import android.content.Context
import com.album.demo.AlbumApplication
import com.album.demo.di.scope.ApplicationScope
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val application: AlbumApplication) {

    @Provides
    @ApplicationScope
    fun provideContext(): Context {
        return application.applicationContext
    }
}