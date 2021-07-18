package com.raveendran.runningapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.raveendran.runningapp.repositories.MainRepository

class StatisticsViewModel @ViewModelInject constructor(
    private val mainRepository: MainRepository
) : ViewModel() {

    val totalTimeRun = mainRepository.getTotalRunTimeInMillis()
    val totalDistance = mainRepository.getTotalRunDistance()
    val totalCaloriesBurned = mainRepository.getTotalRunCaloriesBurned()
    val totalAvgSpeed = mainRepository.getTotalRunAvgSpeed()

    val runsSortedByDate = mainRepository.getAllRunsSortedByDate()
}