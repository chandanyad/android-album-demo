package com.album.demo.di.module

import android.content.Context
import com.album.demo.db.AlbumMigration
import com.album.demo.di.scope.ApplicationScope
import dagger.Module
import dagger.Provides
import io.realm.Realm
import io.realm.RealmConfiguration

@Module
class DBModule(context: Context) {
    private val version = 1L

    init {
        Realm.init(context)
        Realm.setDefaultConfiguration(
            RealmConfiguration.Builder()
                .schemaVersion(version)
                .migration(AlbumMigration())
                .build()
        )
    }

    @Provides
    @ApplicationScope
    internal fun provideRealm(): Realm {
        return Realm.getDefaultInstance()
    }
}