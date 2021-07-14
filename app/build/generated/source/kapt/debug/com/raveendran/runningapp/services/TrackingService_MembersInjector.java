package com.raveendran.runningapp.services;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.location.FusedLocationProviderClient;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class TrackingService_MembersInjector implements MembersInjector<TrackingService> {
  private final Provider<FusedLocationProviderClient> fusedLocationProviderClientProvider;

  private final Provider<NotificationCompat.Builder> baseNotificationBuilderProvider;

  public TrackingService_MembersInjector(
      Provider<FusedLocationProviderClient> fusedLocationProviderClientProvider,
      Provider<NotificationCompat.Builder> baseNotificationBuilderProvider) {
    this.fusedLocationProviderClientProvider = fusedLocationProviderClientProvider;
    this.baseNotificationBuilderProvider = baseNotificationBuilderProvider;
  }

  public static MembersInjector<TrackingService> create(
      Provider<FusedLocationProviderClient> fusedLocationProviderClientProvider,
      Provider<NotificationCompat.Builder> baseNotificationBuilderProvider) {
    return new TrackingService_MembersInjector(fusedLocationProviderClientProvider, baseNotificationBuilderProvider);
  }

  @Override
  public void injectMembers(TrackingService instance) {
    injectFusedLocationProviderClient(instance, fusedLocationProviderClientProvider.get());
    injectBaseNotificationBuilder(instance, baseNotificationBuilderProvider.get());
  }

  @InjectedFieldSignature("com.raveendran.runningapp.services.TrackingService.fusedLocationProviderClient")
  public static void injectFusedLocationProviderClient(TrackingService instance,
      FusedLocationProviderClient fusedLocationProviderClient) {
    instance.fusedLocationProviderClient = fusedLocationProviderClient;
  }

  @InjectedFieldSignature("com.raveendran.runningapp.services.TrackingService.baseNotificationBuilder")
  public static void injectBaseNotificationBuilder(TrackingService instance,
      NotificationCompat.Builder baseNotificationBuilder) {
    instance.baseNotificationBuilder = baseNotificationBuilder;
  }
}
