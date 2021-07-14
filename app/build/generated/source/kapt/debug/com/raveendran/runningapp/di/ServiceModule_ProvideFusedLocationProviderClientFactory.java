package com.raveendran.runningapp.di;

import android.content.Context;
import com.google.android.gms.location.FusedLocationProviderClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ServiceModule_ProvideFusedLocationProviderClientFactory implements Factory<FusedLocationProviderClient> {
  private final Provider<Context> appProvider;

  public ServiceModule_ProvideFusedLocationProviderClientFactory(Provider<Context> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public FusedLocationProviderClient get() {
    return provideFusedLocationProviderClient(appProvider.get());
  }

  public static ServiceModule_ProvideFusedLocationProviderClientFactory create(
      Provider<Context> appProvider) {
    return new ServiceModule_ProvideFusedLocationProviderClientFactory(appProvider);
  }

  public static FusedLocationProviderClient provideFusedLocationProviderClient(Context app) {
    return Preconditions.checkNotNull(ServiceModule.INSTANCE.provideFusedLocationProviderClient(app), "Cannot return null from a non-@Nullable @Provides method");
  }
}
