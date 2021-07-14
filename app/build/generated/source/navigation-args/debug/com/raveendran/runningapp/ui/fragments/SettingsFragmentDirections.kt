package com.raveendran.runningapp.ui.fragments

import androidx.navigation.NavDirections
import com.raveendran.runningapp.NavGraphDirections

class SettingsFragmentDirections private constructor() {
  companion object {
    fun actionGlobalTrackingFragment(): NavDirections =
        NavGraphDirections.actionGlobalTrackingFragment()
  }
}
