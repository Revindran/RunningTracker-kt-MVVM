package com.raveendran.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.raveendran.runningapp.R
import com.raveendran.runningapp.ui.viewmodels.MainViewModel
import com.raveendran.runningapp.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    val viewModel: StatisticsViewModel by viewModels()

}