package com.album.demo.di.component

import com.album.demo.modules.album.ui.AlbumActivity
import com.album.demo.di.module.AlbumModule
import com.album.demo.di.scope.AlbumScreenScope
import dagger.Component

@AlbumScreenScope
@Component(modules = [AlbumModule::class], dependencies = [ApplicationComponent::class])
interface ScreenComponent {
    fun inject(activity: AlbumActivity)
}