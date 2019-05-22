package com.album.demo.di.module;

import com.album.demo.modules.album.ui.AlbumContracts;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AlbumModule_ProvideAlbumViewFactory implements Factory<AlbumContracts.View> {
  private final AlbumModule module;

  public AlbumModule_ProvideAlbumViewFactory(AlbumModule module) {
    this.module = module;
  }

  @Override
  public AlbumContracts.View get() {
    return Preconditions.checkNotNull(
        module.provideAlbumView(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AlbumModule_ProvideAlbumViewFactory create(AlbumModule module) {
    return new AlbumModule_ProvideAlbumViewFactory(module);
  }

  public static AlbumContracts.View proxyProvideAlbumView(AlbumModule instance) {
    return Preconditions.checkNotNull(
        instance.provideAlbumView(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
