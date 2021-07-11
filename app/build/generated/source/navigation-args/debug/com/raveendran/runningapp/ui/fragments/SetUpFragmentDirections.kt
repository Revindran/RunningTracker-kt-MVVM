package com.raveendran.runningapp.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.raveendran.runningapp.NavGraphDirections
import com.raveendran.runningapp.R

class SetUpFragmentDirections private constructor() {
  companion object {
    fun actionSetUpFragmentToRunFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_setUpFragment_to_runFragment)

    fun actionGlobalTrackingFragment(): NavDirections =
        NavGraphDirections.actionGlobalTrackingFragment()
  }
}
