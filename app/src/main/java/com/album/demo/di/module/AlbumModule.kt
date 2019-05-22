package com.album.demo.di.module

import android.app.Activity
import com.album.demo.di.scope.AlbumScreenScope
import com.album.demo.modules.album.domain.AlbumService
import com.album.demo.modules.album.domain.AlbumServiceContract
import com.album.demo.modules.album.domain.repo.AlbumRepoContract
import com.album.demo.modules.album.infra.AlbumDataSourceContract
import com.album.demo.modules.album.infra.AlbumRepo
import com.album.demo.modules.album.infra.local.AlbumLocalDS
import com.album.demo.modules.album.infra.remote.AlbumApi
import com.album.demo.modules.album.infra.remote.AlbumRemoteDS
import com.album.demo.modules.album.ui.AlbumActivity
import com.album.demo.modules.album.ui.AlbumContracts
import com.album.demo.modules.album.ui.AlbumPresenter
import dagger.Module
import dagger.Provides
import io.realm.Realm
import org.intellij.lang.annotations.Identifier
import retrofit2.Retrofit
import javax.inject.Named

@Module
class AlbumModule(private var activity: Activity) {

    @Provides
    @AlbumScreenScope
    fun provideAlbumView(): AlbumContracts.View {
        return activity as AlbumActivity
    }

    @Provides
    @AlbumScreenScope
    fun provideAlbumPresenter(view: AlbumContracts.View, albumServiceContract: AlbumServiceContract):
            AlbumContracts.Presenter {
        return AlbumPresenter(view, albumServiceContract)
    }

    @Provides
    @AlbumScreenScope
    fun provideAlbumService(repoContract: AlbumRepoContract): AlbumServiceContract {
        return AlbumService(repoContract)
    }

    @Provides
    @AlbumScreenScope
    fun provideAlbumRepo(
        @Named("LOCAL_DS") localDataSourceContract: AlbumDataSourceContract,
        @Named("REMOTE_DS") remoteDataSourceContract: AlbumDataSourceContract
    ): AlbumRepoContract {
        return AlbumRepo(localDataSourceContract, remoteDataSourceContract)
    }

    @Provides
    @AlbumScreenScope
    @Named("LOCAL_DS")
    fun provideAlbumLocalDS(realm: Realm): AlbumDataSourceContract {
        return AlbumLocalDS(realm)
    }

    @Provides
    @AlbumScreenScope
    @Named("REMOTE_DS")
    fun provideAlbumRemoteDS(api: AlbumApi): AlbumDataSourceContract {
        return AlbumRemoteDS(api)
    }

    @Provides
    @AlbumScreenScope
    fun provideAlbumApi(retrofit: Retrofit): AlbumApi {
        return retrofit.create(AlbumApi::class.java)
    }

}