package com.album.demo.di.component;

import com.album.demo.AlbumApplication;
import com.album.demo.di.module.AppModule;
import com.album.demo.di.module.DBModule;
import com.album.demo.di.module.NetworkModule;
import com.album.demo.di.module.NetworkModule_ProvideOkHttpClient$app_debugFactory;
import com.album.demo.di.module.NetworkModule_ProvideRetrofit$app_debugFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerApplicationComponent implements ApplicationComponent {
  private Provider<OkHttpClient> provideOkHttpClient$app_debugProvider;

  private Provider<Retrofit> provideRetrofit$app_debugProvider;

  private DaggerApplicationComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static ApplicationComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.provideOkHttpClient$app_debugProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideOkHttpClient$app_debugFactory.create(builder.networkModule));
    this.provideRetrofit$app_debugProvider =
        DoubleCheck.provider(
            NetworkModule_ProvideRetrofit$app_debugFactory.create(
                builder.networkModule, provideOkHttpClient$app_debugProvider));
  }

  @Override
  public void inject(AlbumApplication application) {}

  @Override
  public Retrofit getRetroFit() {
    return provideRetrofit$app_debugProvider.get();
  }

  public static final class Builder {
    private NetworkModule networkModule;

    private Builder() {}

    public ApplicationComponent build() {
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      return new DaggerApplicationComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This
     *     method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder dBModule(DBModule dBModule) {
      Preconditions.checkNotNull(dBModule);
      return this;
    }
  }
}
