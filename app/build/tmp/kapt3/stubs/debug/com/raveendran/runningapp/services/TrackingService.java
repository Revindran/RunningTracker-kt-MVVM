package com.raveendran.runningapp.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010&\u001a\u00020\'H\u0002J\u0012\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0002J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0003J\b\u0010/\u001a\u00020)H\u0002J\b\u00100\u001a\u00020)H\u0016J\"\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\u0006\u00105\u001a\u0002022\u0006\u00106\u001a\u000202H\u0016J\b\u00107\u001a\u00020)H\u0002J\b\u00108\u001a\u00020)H\u0002J\b\u00109\u001a\u00020)H\u0002J\b\u0010:\u001a\u00020)H\u0002J\u0010\u0010;\u001a\u00020)2\u0006\u0010<\u001a\u00020\u0013H\u0003J\u0010\u0010=\u001a\u00020)2\u0006\u0010<\u001a\u00020\u0013H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R\u000e\u0010\"\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006?"}, d2 = {"Lcom/raveendran/runningapp/services/TrackingService;", "Landroidx/lifecycle/LifecycleService;", "()V", "baseNotificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "getBaseNotificationBuilder", "()Landroidx/core/app/NotificationCompat$Builder;", "setBaseNotificationBuilder", "(Landroidx/core/app/NotificationCompat$Builder;)V", "curNotificationBuilder", "getCurNotificationBuilder", "setCurNotificationBuilder", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getFusedLocationProviderClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setFusedLocationProviderClient", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "isFirstRun", "", "()Z", "setFirstRun", "(Z)V", "isTimerEnabled", "lapTime", "", "lastSecondTimestamp", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "getLocationCallback", "()Lcom/google/android/gms/location/LocationCallback;", "serviceKilled", "getServiceKilled", "setServiceKilled", "timeRun", "timeRunInSeconds", "Landroidx/lifecycle/MutableLiveData;", "timeStarted", "addEmptyPolyline", "", "addPathPoint", "", "location", "Landroid/location/Location;", "createNotificationChannel", "notificationManager", "Landroid/app/NotificationManager;", "killService", "onCreate", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "pauseService", "postInitialValues", "startForegroundService", "startTimer", "updateLocationTracking", "isTracking", "updateNotificationTrackingState", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class TrackingService extends androidx.lifecycle.LifecycleService {
    private boolean isFirstRun = true;
    private boolean serviceKilled = false;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> timeRunInSeconds = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.core.app.NotificationCompat.Builder baseNotificationBuilder;
    @org.jetbrains.annotations.NotNull()
    public androidx.core.app.NotificationCompat.Builder curNotificationBuilder;
    private boolean isTimerEnabled = false;
    private long lapTime = 0L;
    private long timeRun = 0L;
    private long timeStarted = 0L;
    private long lastSecondTimestamp = 0L;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.location.LocationCallback locationCallback = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.MutableLiveData<java.lang.Long> timeRunInMillis = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isTracking = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.lifecycle.MutableLiveData<java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>>> pathPoints = null;
    public static final com.raveendran.runningapp.services.TrackingService.Companion Companion = null;
    
    public final boolean isFirstRun() {
        return false;
    }
    
    public final void setFirstRun(boolean p0) {
    }
    
    public final boolean getServiceKilled() {
        return false;
    }
    
    public final void setServiceKilled(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient() {
        return null;
    }
    
    public final void setFusedLocationProviderClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.core.app.NotificationCompat.Builder getBaseNotificationBuilder() {
        return null;
    }
    
    public final void setBaseNotificationBuilder(@org.jetbrains.annotations.NotNull()
    androidx.core.app.NotificationCompat.Builder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.core.app.NotificationCompat.Builder getCurNotificationBuilder() {
        return null;
    }
    
    public final void setCurNotificationBuilder(@org.jetbrains.annotations.NotNull()
    androidx.core.app.NotificationCompat.Builder p0) {
    }
    
    private final void postInitialValues() {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void killService() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void startTimer() {
    }
    
    private final void pauseService() {
    }
    
    private final void updateNotificationTrackingState(boolean isTracking) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void updateLocationTracking(boolean isTracking) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.LocationCallback getLocationCallback() {
        return null;
    }
    
    private final void addPathPoint(android.location.Location location) {
    }
    
    private final java.lang.Object addEmptyPolyline() {
        return null;
    }
    
    private final void startForegroundService() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void createNotificationChannel(android.app.NotificationManager notificationManager) {
    }
    
    public TrackingService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0006R#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/raveendran/runningapp/services/TrackingService$Companion;", "", "()V", "isTracking", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "pathPoints", "", "Lcom/google/android/gms/maps/model/LatLng;", "getPathPoints", "timeRunInMillis", "", "getTimeRunInMillis", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.MutableLiveData<java.lang.Long> getTimeRunInMillis() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isTracking() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.MutableLiveData<java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>>> getPathPoints() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}