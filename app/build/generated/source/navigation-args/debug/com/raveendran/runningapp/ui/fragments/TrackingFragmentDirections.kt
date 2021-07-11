package com.raveendran.runningapp.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.raveendran.runningapp.NavGraphDirections
import com.raveendran.runningapp.R

class TrackingFragmentDirections private constructor() {
  companion object {
    fun actionTrackingFragmentToRunFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_trackingFragment_to_runFragment2)

    fun actionGlobalTrackingFragment(): NavDirections =
        NavGraphDirections.actionGlobalTrackingFragment()
  }
}
