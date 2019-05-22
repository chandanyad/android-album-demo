package com.album.demo.di.module;

import com.album.demo.modules.album.infra.AlbumDataSourceContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AlbumModule_ProvideAlbumLocalDSFactory
    implements Factory<AlbumDataSourceContract> {
  private final AlbumModule module;

  public AlbumModule_ProvideAlbumLocalDSFactory(AlbumModule module) {
    this.module = module;
  }

  @Override
  public AlbumDataSourceContract get() {
    return Preconditions.checkNotNull(
        module.provideAlbumLocalDS(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AlbumModule_ProvideAlbumLocalDSFactory create(AlbumModule module) {
    return new AlbumModule_ProvideAlbumLocalDSFactory(module);
  }

  public static AlbumDataSourceContract proxyProvideAlbumLocalDS(AlbumModule instance) {
    return Preconditions.checkNotNull(
        instance.provideAlbumLocalDS(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
