package com.raveendran.runningapp.ui.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nJ\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001f"}, d2 = {"Lcom/raveendran/runningapp/ui/viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/raveendran/runningapp/repositories/MainRepository;", "(Lcom/raveendran/runningapp/repositories/MainRepository;)V", "getMainRepository", "()Lcom/raveendran/runningapp/repositories/MainRepository;", "runs", "Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/raveendran/runningapp/db/Run;", "getRuns", "()Landroidx/lifecycle/MediatorLiveData;", "runsSortedByAvgSpeed", "Landroidx/lifecycle/LiveData;", "runsSortedByCaloriesBurned", "runsSortedByDate", "runsSortedByDistance", "runsSortedByTimeInMillis", "sortType", "Lcom/raveendran/runningapp/utils/SortType;", "getSortType", "()Lcom/raveendran/runningapp/utils/SortType;", "setSortType", "(Lcom/raveendran/runningapp/utils/SortType;)V", "insertRun", "Lkotlinx/coroutines/Job;", "run", "sortRuns", "", "(Lcom/raveendran/runningapp/utils/SortType;)Lkotlin/Unit;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.LiveData<java.util.List<com.raveendran.runningapp.db.Run>> runsSortedByDate = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.raveendran.runningapp.db.Run>> runsSortedByDistance = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.raveendran.runningapp.db.Run>> runsSortedByCaloriesBurned = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.raveendran.runningapp.db.Run>> runsSortedByTimeInMillis = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.raveendran.runningapp.db.Run>> runsSortedByAvgSpeed = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.util.List<com.raveendran.runningapp.db.Run>> runs = null;
    @org.jetbrains.annotations.NotNull()
    private com.raveendran.runningapp.utils.SortType sortType = com.raveendran.runningapp.utils.SortType.DATE;
    @org.jetbrains.annotations.NotNull()
    private final com.raveendran.runningapp.repositories.MainRepository mainRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.List<com.raveendran.runningapp.db.Run>> getRuns() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.raveendran.runningapp.utils.SortType getSortType() {
        return null;
    }
    
    public final void setSortType(@org.jetbrains.annotations.NotNull()
    com.raveendran.runningapp.utils.SortType p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit sortRuns(@org.jetbrains.annotations.NotNull()
    com.raveendran.runningapp.utils.SortType sortType) {
        return null;
    }
    
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