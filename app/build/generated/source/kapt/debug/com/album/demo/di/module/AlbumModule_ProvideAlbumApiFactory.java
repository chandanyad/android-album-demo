package com.album.demo.di.module;

import com.album.demo.modules.album.infra.remote.AlbumApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AlbumModule_ProvideAlbumApiFactory implements Factory<AlbumApi> {
  private final AlbumModule module;

  private final Provider<Retrofit> retrofitProvider;

  public AlbumModule_ProvideAlbumApiFactory(
      AlbumModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public AlbumApi get() {
    return Preconditions.checkNotNull(
        module.provideAlbumApi(retrofitProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AlbumModule_ProvideAlbumApiFactory create(
      AlbumModule module, Provider<Retrofit> retrofitProvider) {
    return new AlbumModule_ProvideAlbumApiFactory(module, retrofitProvider);
  }

  public static AlbumApi proxyProvideAlbumApi(AlbumModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(
        instance.provideAlbumApi(retrofit),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
