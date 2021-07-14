package com.raveendran.runningapp.di;

import android.app.PendingIntent;
import android.content.Context;
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
public final class ServiceModule_ProvideMainActivityPendingIntentFactory implements Factory<PendingIntent> {
  private final Provider<Context> appProvider;

  public ServiceModule_ProvideMainActivityPendingIntentFactory(Provider<Context> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public PendingIntent get() {
    return provideMainActivityPendingIntent(appProvider.get());
  }

  public static ServiceModule_ProvideMainActivityPendingIntentFactory create(
      Provider<Context> appProvider) {
    return new ServiceModule_ProvideMainActivityPendingIntentFactory(appProvider);
  }

  public static PendingIntent provideMainActivityPendingIntent(Context app) {
    return Preconditions.checkNotNull(ServiceModule.INSTANCE.provideMainActivityPendingIntent(app), "Cannot return null from a non-@Nullable @Provides method");
  }
}
