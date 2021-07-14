package com.raveendran.runningapp.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ServiceComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u001a\u0010\u000b\u001a\n \f*\u0004\u0018\u00010\b0\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\r"}, d2 = {"Lcom/raveendran/runningapp/di/ServiceModule;", "", "()V", "provideBaseNotificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "app", "Landroid/content/Context;", "pendingIntent", "Landroid/app/PendingIntent;", "provideFusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "provideMainActivityPendingIntent", "kotlin.jvm.PlatformType", "app_debug"})
@dagger.Module()
public final class ServiceModule {
    public static final com.raveendran.runningapp.di.ServiceModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ServiceScoped()
    @dagger.Provides()
    public final com.google.android.gms.location.FusedLocationProviderClient provideFusedLocationProviderClient(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context app) {
        return null;
    }
    
    @dagger.hilt.android.scopes.ServiceScoped()
    @dagger.Provides()
    public final android.app.PendingIntent provideMainActivityPendingIntent(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ServiceScoped()
    @dagger.Provides()
    public final androidx.core.app.NotificationCompat.Builder provideBaseNotificationBuilder(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context app, @org.jetbrains.annotations.NotNull()
    android.app.PendingIntent pendingIntent) {
        return null;
    }
    
    private ServiceModule() {
        super();
    }
}