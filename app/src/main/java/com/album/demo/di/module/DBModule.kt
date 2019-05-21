package com.album.demo.di.module

import android.app.Activity
import android.content.Context
import com.album.demo.di.scope.AlbumScreenScope
import dagger.Module

@Module
class DBModule(private var context: Context) {}