package com.album.demo.di.module;

import com.album.demo.modules.album.domain.repo.AlbumRepoContract;
import com.album.demo.modules.album.infra.AlbumDataSourceContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AlbumModule_ProvideAlbumRepoFactory implements Factory<AlbumRepoContract> {
  private final AlbumModule module;

  private final Provider<AlbumDataSourceContract>
      localDataSourceContractAndRemoteDataSourceContractProvider;

  public AlbumModule_ProvideAlbumRepoFactory(
      AlbumModule module,
      Provider<AlbumDataSourceContract>
          localDataSourceContractAndRemoteDataSourceContractProvider) {
    this.module = module;
    this.localDataSourceContractAndRemoteDataSourceContractProvider =
        localDataSourceContractAndRemoteDataSourceContractProvider;
  }

  @Override
  public AlbumRepoContract get() {
    return Preconditions.checkNotNull(
        module.provideAlbumRepo(
            localDataSourceContractAndRemoteDataSourceContractProvider.get(),
            localDataSourceContractAndRemoteDataSourceContractProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AlbumModule_ProvideAlbumRepoFactory create(
      AlbumModule module,
      Provider<AlbumDataSourceContract>
          localDataSourceContractAndRemoteDataSourceContractProvider) {
    return new AlbumModule_ProvideAlbumRepoFactory(
        module, localDataSourceContractAndRemoteDataSourceContractProvider);
  }

  public static AlbumRepoContract proxyProvideAlbumRepo(
      AlbumModule instance,
      AlbumDataSourceContract localDataSourceContract,
      AlbumDataSourceContract remoteDataSourceContract) {
    return Preconditions.checkNotNull(
        instance.provideAlbumRepo(localDataSourceContract, remoteDataSourceContract),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
