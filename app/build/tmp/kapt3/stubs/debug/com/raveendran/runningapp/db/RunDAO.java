package com.raveendran.runningapp.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\'J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\'J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bH\'J\u0019\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/raveendran/runningapp/db/RunDAO;", "", "deleteRun", "", "run", "Lcom/raveendran/runningapp/db/Run;", "(Lcom/raveendran/runningapp/db/Run;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllRunsSortedByAvgSpeed", "Landroidx/lifecycle/LiveData;", "", "getAllRunsSortedByCaloriesBurned", "getAllRunsSortedByDate", "getAllRunsSortedByDistanceInMeter", "getAllRunsSortedByTimeInMillis", "getTotalAvgSpeed", "", "getTotalCaloriesBurned", "", "getTotalDistance", "getTotalTimeInMills", "", "insertRun", "app_debug"})
public abstract interface RunDAO {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertRun(@org.jetbrains.annotations.NotNull()
    com.raveendran.runningapp.db.Run run, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteRun(@org.jetbrains.annotations.NotNull()
    com.raveendran.runningapp.db.Run run, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM runner_table ORDER BY timeStamp DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raveendran.runningapp.db.Run>> getAllRunsSortedByDate();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM RUNNER_TABLE ORDER BY timeInMillis DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raveendran.runningapp.db.Run>> getAllRunsSortedByTimeInMillis();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM runner_table ORDER BY avgSpeedInKmpl DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raveendran.runningapp.db.Run>> getAllRunsSortedByAvgSpeed();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM RUNNER_TABLE ORDER BY distanceInMeter DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raveendran.runningapp.db.Run>> getAllRunsSortedByDistanceInMeter();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM runner_table ORDER BY caloriesBurned DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.raveendran.runningapp.db.Run>> getAllRunsSortedByCaloriesBurned();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT SUM(distanceInMeter) FROM runner_table")
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getTotalDistance();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT SUM(timeInMillis) FROM runner_table")
    public abstract androidx.lifecycle.LiveData<java.lang.Long> getTotalTimeInMills();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT SUM(caloriesBurned) FROM runner_table")
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getTotalCaloriesBurned();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT AVG(avgSpeedInKmpl) FROM runner_table")
    public abstract androidx.lifecycle.LiveData<java.lang.Float> getTotalAvgSpeed();
}