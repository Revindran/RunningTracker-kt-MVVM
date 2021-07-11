package com.raveendran.runningapp.repositories

import com.raveendran.runningapp.db.Run
import com.raveendran.runningapp.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDAO
) {

    suspend fun insertRun(run: Run) = runDao.insertRun(run)
    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunsSortedByDate()
    fun getAllRunsSortedByDistance() = runDao.getAllRunsSortedByDistanceInMeter()
    fun getAllRunsSortedByTimeInMillis() = runDao.getAllRunsSortedByTimeInMillis()
    fun getAllRunsSortedByAvgSpeed() = runDao.getAllRunsSortedByAvgSpeed()
    fun getAllRunsSortedByCaloriesBurned() = runDao.getAllRunsSortedByCaloriesBurned()

    fun getTotalRunDistance() = runDao.getTotalDistance()
    fun getTotalRunTimeInMillis() = runDao.getTotalTimeInMills()
    fun getTotalRunCaloriesBurned() = runDao.getTotalCaloriesBurned()
    fun getTotalRunAvgSpeed() = runDao.getTotalAvgSpeed()


}