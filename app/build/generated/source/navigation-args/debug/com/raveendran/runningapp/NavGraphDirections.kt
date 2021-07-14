package com.raveendran.runningapp

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

class NavGraphDirections private constructor() {
  companion object {
    fun actionGlobalTrackingFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_global_trackingFragment)
  }
}
