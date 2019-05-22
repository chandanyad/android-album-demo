package com.album.demo.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/album/demo/di/module/NetworkModule;", "", "()V", "baseURL", "", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "provideOkHttpClient$app_debug", "provideRetrofit", "Lretrofit2/Retrofit;", "okHttpClient", "provideRetrofit$app_debug", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    private final java.lang.String baseURL = "https://jsonplaceholder.typicode.com";
    
    @org.jetbrains.annotations.NotNull()
    @com.album.demo.di.scope.ApplicationScope()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.album.demo.di.scope.ApplicationScope()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit$app_debug(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    public NetworkModule() {
        super();
    }
}