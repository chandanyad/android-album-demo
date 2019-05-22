package com.album.demo.di.module;

import com.album.demo.modules.album.domain.AlbumServiceContract;
import com.album.demo.modules.album.domain.repo.AlbumRepoContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AlbumModule_ProvideAlbumServiceFactory implements Factory<AlbumServiceContract> {
  private final AlbumModule module;

  private final Provider<AlbumRepoContract> repoContractProvider;

  public AlbumModule_ProvideAlbumServiceFactory(
      AlbumModule module, Provider<AlbumRepoContract> repoContractProvider) {
    this.module = module;
    this.repoContractProvider = repoContractProvider;
  }

  @Override
  public AlbumServiceContract get() {
    return Preconditions.checkNotNull(
        module.provideAlbumService(repoContractProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AlbumModule_ProvideAlbumServiceFactory create(
      AlbumModule module, Provider<AlbumRepoContract> repoContractProvider) {
    return new AlbumModule_ProvideAlbumServiceFactory(module, repoContractProvider);
  }

  public static AlbumServiceContract proxyProvideAlbumService(
      AlbumModule instance, AlbumRepoContract repoContract) {
    return Preconditions.checkNotNull(
        instance.provideAlbumService(repoContract),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
