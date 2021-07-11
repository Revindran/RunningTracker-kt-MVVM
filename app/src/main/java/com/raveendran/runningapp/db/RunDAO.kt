package com.raveendran.runningapp.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM runner_table ORDER BY timeStamp DESC")
    fun getAllRunsSortedByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM RUNNER_TABLE ORDER BY timeInMillis DESC")
    fun getAllRunsSortedByTimeInMillis(): LiveData<List<Run>>

    @Query("SELECT * FROM runner_table ORDER BY avgSpeedInKmpl DESC")
    fun getAllRunsSortedByAvgSpeed(): LiveData<List<Run>>

    @Query("SELECT * FROM RUNNER_TABLE ORDER BY distanceInMeter DESC")
    fun getAllRunsSortedByDistanceInMeter(): LiveData<List<Run>>

    @Query("SELECT * FROM runner_table ORDER BY caloriesBurned DESC")
    fun getAllRunsSortedByCaloriesBurned(): LiveData<List<Run>>

    @Query("SELECT SUM(distanceInMeter) FROM runner_table")
    fun getTotalDistance(): LiveData<Int>

    @Query("SELECT SUM(timeInMillis) FROM runner_table")
    fun getTotalTimeInMills(): LiveData<Long>

    @Query("SELECT SUM(caloriesBurned) FROM runner_table")
    fun getTotalCaloriesBurned(): LiveData<Int>

    @Query("SELECT AVG(avgSpeedInKmpl) FROM runner_table")
    fun getTotalAvgSpeed(): LiveData<Float>
}