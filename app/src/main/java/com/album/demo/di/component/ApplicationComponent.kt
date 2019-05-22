package com.album.demo.di.component

import com.album.demo.AlbumApplication
import com.album.demo.di.module.AppModule
import com.album.demo.di.module.DBModule
import com.album.demo.di.module.NetworkModule
import com.album.demo.di.scope.ApplicationScope
import dagger.Component
import io.realm.Realm
import retrofit2.Retrofit

@ApplicationScope
@Component(modules = [AppModule::class, NetworkModule::class, DBModule::class])
interface ApplicationComponent {
    fun inject(application: AlbumApplication)

    fun injectRetroFit(): Retrofit

    fun injectRealm(): Realm
}