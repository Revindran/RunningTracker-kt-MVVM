package com.raveendran.runningapp.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.raveendran.runningapp.NavGraphDirections
import com.raveendran.runningapp.R

class RunFragmentDirections private constructor() {
  companion object {
    fun actionRunFragmentToTrackingFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_runFragment_to_trackingFragment2)

    fun actionGlobalTrackingFragment(): NavDirections =
        NavGraphDirections.actionGlobalTrackingFragment()
  }
}
