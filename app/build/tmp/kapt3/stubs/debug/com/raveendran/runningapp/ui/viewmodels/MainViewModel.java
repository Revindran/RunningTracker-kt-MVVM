package com.raveendran.runningapp.ui.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/raveendran/runningapp/ui/viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/raveendran/runningapp/repositories/MainRepository;", "(Lcom/raveendran/runningapp/repositories/MainRepository;)V", "getMainRepository", "()Lcom/raveendran/runningapp/repositories/MainRepository;", "insertRun", "Lkotlinx/coroutines/Job;", "run", "Lcom/raveendran/runningapp/db/Run;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.raveendran.runningapp.repositories.MainRepository mainRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertRun(@org.jetbrains.annotations.NotNull()
    com.raveendran.runningapp.db.Run run) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raveendran.runningapp.repositories.MainRepository getMainRepository() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.raveendran.runningapp.repositories.MainRepository mainRepository) {
        super();
    }
}