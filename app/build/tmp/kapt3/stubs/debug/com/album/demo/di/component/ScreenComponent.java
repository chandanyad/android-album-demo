package com.album.demo.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/album/demo/di/component/ScreenComponent;", "", "inject", "", "activity", "Lcom/album/demo/modules/album/ui/AlbumActivity;", "app_debug"})
@dagger.Component(modules = {com.album.demo.di.module.AlbumModule.class}, dependencies = {com.album.demo.di.component.ApplicationComponent.class})
@com.album.demo.di.scope.AlbumScreenScope()
public abstract interface ScreenComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.album.demo.modules.album.ui.AlbumActivity activity);
}