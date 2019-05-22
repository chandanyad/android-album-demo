package com.album.demo.di.module;

import com.album.demo.modules.album.infra.AlbumDataSourceContract;
import com.album.demo.modules.album.infra.remote.AlbumApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AlbumModule_ProvideAlbumRemoteDSFactory
    implements Factory<AlbumDataSourceContract> {
  private final AlbumModule module;

  private final Provider<AlbumApi> apiProvider;

  public AlbumModule_ProvideAlbumRemoteDSFactory(
      AlbumModule module, Provider<AlbumApi> apiProvider) {
    this.module = module;
    this.apiProvider = apiProvider;
  }

  @Override
  public AlbumDataSourceContract get() {
    return Preconditions.checkNotNull(
        module.provideAlbumRemoteDS(apiProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AlbumModule_ProvideAlbumRemoteDSFactory create(
      AlbumModule module, Provider<AlbumApi> apiProvider) {
    return new AlbumModule_ProvideAlbumRemoteDSFactory(module, apiProvider);
  }

  public static AlbumDataSourceContract proxyProvideAlbumRemoteDS(
      AlbumModule instance, AlbumApi api) {
    return Preconditions.checkNotNull(
        instance.provideAlbumRemoteDS(api),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
