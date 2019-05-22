package com.album.demo.modules.album.ui;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AlbumActivity_MembersInjector implements MembersInjector<AlbumActivity> {
  private final Provider<AlbumContracts.Presenter> presenterProvider;

  public AlbumActivity_MembersInjector(Provider<AlbumContracts.Presenter> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<AlbumActivity> create(
      Provider<AlbumContracts.Presenter> presenterProvider) {
    return new AlbumActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(AlbumActivity instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  public static void injectPresenter(AlbumActivity instance, AlbumContracts.Presenter presenter) {
    instance.presenter = presenter;
  }
}
