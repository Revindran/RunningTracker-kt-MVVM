package com.raveendran.runningapp.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/raveendran/runningapp/ui/fragments/SetUpFragment;", "Landroidx/fragment/app/Fragment;", "()V", "<set-?>", "", "isFirstAppOpen", "()Z", "setFirstAppOpen", "(Z)V", "sharedPref", "Landroid/content/SharedPreferences;", "getSharedPref", "()Landroid/content/SharedPreferences;", "setSharedPref", "(Landroid/content/SharedPreferences;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "writePersonalDataToSharedPref", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SetUpFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.content.SharedPreferences sharedPref;
    private boolean isFirstAppOpen = true;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPref() {
        return null;
    }
    
    public final void setSharedPref(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    public final boolean isFirstAppOpen() {
        return false;
    }
    
    @javax.inject.Inject()
    public final void setFirstAppOpen(boolean p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean writePersonalDataToSharedPref() {
        return false;
    }
    
    public SetUpFragment() {
        super();
    }
}