package com.raveendran.runningapp.di;

import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
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
public final class ServiceModule_ProvideBaseNotificationBuilderFactory implements Factory<NotificationCompat.Builder> {
  private final Provider<Context> appProvider;

  private final Provider<PendingIntent> pendingIntentProvider;

  public ServiceModule_ProvideBaseNotificationBuilderFactory(Provider<Context> appProvider,
      Provider<PendingIntent> pendingIntentProvider) {
    this.appProvider = appProvider;
    this.pendingIntentProvider = pendingIntentProvider;
  }

  @Override
  public NotificationCompat.Builder get() {
    return provideBaseNotificationBuilder(appProvider.get(), pendingIntentProvider.get());
  }

  public static ServiceModule_ProvideBaseNotificationBuilderFactory create(
      Provider<Context> appProvider, Provider<PendingIntent> pendingIntentProvider) {
    return new ServiceModule_ProvideBaseNotificationBuilderFactory(appProvider, pendingIntentProvider);
  }

  public static NotificationCompat.Builder provideBaseNotificationBuilder(Context app,
      PendingIntent pendingIntent) {
    return Preconditions.checkNotNull(ServiceModule.INSTANCE.provideBaseNotificationBuilder(app, pendingIntent), "Cannot return null from a non-@Nullable @Provides method");
  }
}
