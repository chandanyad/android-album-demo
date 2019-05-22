package com.album.demo.di.module;

import com.album.demo.modules.album.domain.AlbumServiceContract;
import com.album.demo.modules.album.ui.AlbumContracts;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AlbumModule_ProvideAlbumPresenterFactory
    implements Factory<AlbumContracts.Presenter> {
  private final AlbumModule module;

  private final Provider<AlbumContracts.View> viewProvider;

  private final Provider<AlbumServiceContract> albumServiceContractProvider;

  public AlbumModule_ProvideAlbumPresenterFactory(
      AlbumModule module,
      Provider<AlbumContracts.View> viewProvider,
      Provider<AlbumServiceContract> albumServiceContractProvider) {
    this.module = module;
    this.viewProvider = viewProvider;
    this.albumServiceContractProvider = albumServiceContractProvider;
  }

  @Override
  public AlbumContracts.Presenter get() {
    return Preconditions.checkNotNull(
        module.provideAlbumPresenter(viewProvider.get(), albumServiceContractProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AlbumModule_ProvideAlbumPresenterFactory create(
      AlbumModule module,
      Provider<AlbumContracts.View> viewProvider,
      Provider<AlbumServiceContract> albumServiceContractProvider) {
    return new AlbumModule_ProvideAlbumPresenterFactory(
        module, viewProvider, albumServiceContractProvider);
  }

  public static AlbumContracts.Presenter proxyProvideAlbumPresenter(
      AlbumModule instance, AlbumContracts.View view, AlbumServiceContract albumServiceContract) {
    return Preconditions.checkNotNull(
        instance.provideAlbumPresenter(view, albumServiceContract),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
