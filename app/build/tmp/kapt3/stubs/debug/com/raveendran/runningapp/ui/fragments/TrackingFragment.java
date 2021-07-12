package com.raveendran.runningapp.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\u001a\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u0013H\u0002J\b\u0010&\u001a\u00020\u0013H\u0002J\u0010\u0010\'\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006("}, d2 = {"Lcom/raveendran/runningapp/ui/fragments/TrackingFragment;", "Landroidx/fragment/app/Fragment;", "()V", "currentTimeInMillis", "", "isTracking", "", "map", "Lcom/google/android/gms/maps/GoogleMap;", "pathPoints", "", "Lcom/google/android/gms/maps/model/LatLng;", "viewModel", "Lcom/raveendran/runningapp/ui/viewmodels/MainViewModel;", "getViewModel", "()Lcom/raveendran/runningapp/ui/viewmodels/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addAllPolyLines", "", "addLatestPolyLine", "moveCameraToUser", "onDestroyView", "onLowMemory", "onPause", "onResume", "onStart", "onStop", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "sendCommandToService", "Landroid/content/Intent;", "action", "", "subscribeToObservers", "toggleRun", "updateTracking", "app_debug"})
public final class TrackingFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.google.android.gms.maps.GoogleMap map;
    private boolean isTracking = false;
    private java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>> pathPoints;
    private long currentTimeInMillis = 0L;
    private java.util.HashMap _$_findViewCache;
    
    private final com.raveendran.runningapp.ui.viewmodels.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void subscribeToObservers() {
    }
    
    private final void toggleRun() {
    }
    
    private final void updateTracking(boolean isTracking) {
    }
    
    private final void moveCameraToUser() {
    }
    
    private final void addAllPolyLines() {
    }
    
    private final void addLatestPolyLine() {
    }
    
    private final android.content.Intent sendCommandToService(java.lang.String action) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onLowMemory() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public TrackingFragment() {
        super();
    }
}