package com.album.demo.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideRetrofit$app_debugFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public NetworkModule_ProvideRetrofit$app_debugFactory(
      NetworkModule module, Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.provideRetrofit$app_debug(okHttpClientProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static NetworkModule_ProvideRetrofit$app_debugFactory create(
      NetworkModule module, Provider<OkHttpClient> okHttpClientProvider) {
    return new NetworkModule_ProvideRetrofit$app_debugFactory(module, okHttpClientProvider);
  }

  public static Retrofit proxyProvideRetrofit$app_debug(
      NetworkModule instance, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(
        instance.provideRetrofit$app_debug(okHttpClient),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
