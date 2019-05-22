package com.album.demo.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetworkModule_ProvideOkHttpClient$app_debugFactory
    implements Factory<OkHttpClient> {
  private final NetworkModule module;

  public NetworkModule_ProvideOkHttpClient$app_debugFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.provideOkHttpClient$app_debug(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static NetworkModule_ProvideOkHttpClient$app_debugFactory create(NetworkModule module) {
    return new NetworkModule_ProvideOkHttpClient$app_debugFactory(module);
  }

  public static OkHttpClient proxyProvideOkHttpClient$app_debug(NetworkModule instance) {
    return Preconditions.checkNotNull(
        instance.provideOkHttpClient$app_debug(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
