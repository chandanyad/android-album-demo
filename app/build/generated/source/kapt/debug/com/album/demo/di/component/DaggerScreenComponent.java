package com.album.demo.di.component;

import com.album.demo.di.module.AlbumModule;
import com.album.demo.di.module.AlbumModule_ProvideAlbumApiFactory;
import com.album.demo.di.module.AlbumModule_ProvideAlbumPresenterFactory;
import com.album.demo.di.module.AlbumModule_ProvideAlbumRemoteDSFactory;
import com.album.demo.di.module.AlbumModule_ProvideAlbumRepoFactory;
import com.album.demo.di.module.AlbumModule_ProvideAlbumServiceFactory;
import com.album.demo.di.module.AlbumModule_ProvideAlbumViewFactory;
import com.album.demo.modules.album.domain.AlbumServiceContract;
import com.album.demo.modules.album.domain.repo.AlbumRepoContract;
import com.album.demo.modules.album.infra.AlbumDataSourceContract;
import com.album.demo.modules.album.infra.remote.AlbumApi;
import com.album.demo.modules.album.ui.AlbumActivity;
import com.album.demo.modules.album.ui.AlbumActivity_MembersInjector;
import com.album.demo.modules.album.ui.AlbumContracts;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerScreenComponent implements ScreenComponent {
  private Provider<AlbumContracts.View> provideAlbumViewProvider;

  private com_album_demo_di_component_ApplicationComponent_getRetroFit getRetroFitProvider;

  private Provider<AlbumApi> provideAlbumApiProvider;

  private Provider<AlbumDataSourceContract> provideAlbumRemoteDSProvider;

  private Provider<AlbumRepoContract> provideAlbumRepoProvider;

  private Provider<AlbumServiceContract> provideAlbumServiceProvider;

  private Provider<AlbumContracts.Presenter> provideAlbumPresenterProvider;

  private DaggerScreenComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideAlbumViewProvider =
        DoubleCheck.provider(AlbumModule_ProvideAlbumViewFactory.create(builder.albumModule));
    this.getRetroFitProvider =
        new com_album_demo_di_component_ApplicationComponent_getRetroFit(
            builder.applicationComponent);
    this.provideAlbumApiProvider =
        DoubleCheck.provider(
            AlbumModule_ProvideAlbumApiFactory.create(builder.albumModule, getRetroFitProvider));
    this.provideAlbumRemoteDSProvider =
        DoubleCheck.provider(
            AlbumModule_ProvideAlbumRemoteDSFactory.create(
                builder.albumModule, provideAlbumApiProvider));
    this.provideAlbumRepoProvider =
        DoubleCheck.provider(
            AlbumModule_ProvideAlbumRepoFactory.create(
                builder.albumModule, provideAlbumRemoteDSProvider));
    this.provideAlbumServiceProvider =
        DoubleCheck.provider(
            AlbumModule_ProvideAlbumServiceFactory.create(
                builder.albumModule, provideAlbumRepoProvider));
    this.provideAlbumPresenterProvider =
        DoubleCheck.provider(
            AlbumModule_ProvideAlbumPresenterFactory.create(
                builder.albumModule, provideAlbumViewProvider, provideAlbumServiceProvider));
  }

  @Override
  public void inject(AlbumActivity activity) {
    injectAlbumActivity(activity);
  }

  private AlbumActivity injectAlbumActivity(AlbumActivity instance) {
    AlbumActivity_MembersInjector.injectPresenter(instance, provideAlbumPresenterProvider.get());
    return instance;
  }

  public static final class Builder {
    private AlbumModule albumModule;

    private ApplicationComponent applicationComponent;

    private Builder() {}

    public ScreenComponent build() {
      if (albumModule == null) {
        throw new IllegalStateException(AlbumModule.class.getCanonicalName() + " must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException(
            ApplicationComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerScreenComponent(this);
    }

    public Builder albumModule(AlbumModule albumModule) {
      this.albumModule = Preconditions.checkNotNull(albumModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }
  }

  private static class com_album_demo_di_component_ApplicationComponent_getRetroFit
      implements Provider<Retrofit> {
    private final ApplicationComponent applicationComponent;

    com_album_demo_di_component_ApplicationComponent_getRetroFit(
        ApplicationComponent applicationComponent) {
      this.applicationComponent = applicationComponent;
    }

    @Override
    public Retrofit get() {
      return Preconditions.checkNotNull(
          applicationComponent.getRetroFit(),
          "Cannot return null from a non-@Nullable component method");
    }
  }
}
