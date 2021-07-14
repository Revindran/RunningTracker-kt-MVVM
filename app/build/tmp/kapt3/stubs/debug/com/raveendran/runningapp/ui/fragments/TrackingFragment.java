package com.raveendran.runningapp.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0016J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0015H\u0016J\u0010\u0010\'\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010(\u001a\u00020\u0015H\u0016J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020!H\u0016J\b\u0010+\u001a\u00020\u0015H\u0016J\b\u0010,\u001a\u00020\u0015H\u0016J\u001a\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u0015H\u0002J\b\u00104\u001a\u00020\u0015H\u0002J\b\u00105\u001a\u00020\u0015H\u0002J\b\u00106\u001a\u00020\u0015H\u0002J\u0010\u00107\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u00068"}, d2 = {"Lcom/raveendran/runningapp/ui/fragments/TrackingFragment;", "Landroidx/fragment/app/Fragment;", "()V", "curTimeInMillis", "", "isTracking", "", "map", "Lcom/google/android/gms/maps/GoogleMap;", "menu", "Landroid/view/Menu;", "pathPoints", "", "Lcom/google/android/gms/maps/model/LatLng;", "viewModel", "Lcom/raveendran/runningapp/ui/viewmodels/MainViewModel;", "getViewModel", "()Lcom/raveendran/runningapp/ui/viewmodels/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addAllPolylines", "", "addLatestPolyline", "moveCameraToUser", "onCreateOptionsMenu", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onLowMemory", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onPrepareOptionsMenu", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "onViewCreated", "view", "sendCommandToService", "Landroid/content/Intent;", "action", "", "showCancelDialog", "stopRun", "subscribeToObservers", "toggleRun", "updateTracking", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class TrackingFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean isTracking = false;
    private java.util.List<java.util.List<com.google.android.gms.maps.model.LatLng>> pathPoints;
    private com.google.android.gms.maps.GoogleMap map;
    private long curTimeInMillis = 0L;
    private android.view.Menu menu;
    private java.util.HashMap _$_findViewCache;
    
    private final com.raveendran.runningapp.ui.viewmodels.MainViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void showCancelDialog() {
    }
    
    private final void stopRun() {
    }
    
    private final void updateTracking(boolean isTracking) {
    }
    
    private final void moveCameraToUser() {
    }
    
    private final void addAllPolylines() {
    }
    
    private final void addLatestPolyline() {
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
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    public TrackingFragment() {
        super();
    }
}