package com.raveendran.runningapp.ui.fragments

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.raveendran.runningapp.R

class CancelTrackingDialog : DialogFragment() {

    private var yesListener: (() -> Unit)? = null

    fun setYesListener(listener: (() -> Unit)? = null) {
        yesListener = listener
    }


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return MaterialAlertDialogBuilder(requireContext(), R.style.AlertDialogTheme)
            .setTitle("Cancel Run")
            .setIcon(R.drawable.ic_delete)
            .setMessage("Do You want to delete this run data?")
            .setPositiveButton("Yes") { _, _ ->
                yesListener?.let { yes ->
                    yes()
                }
            }
            .setNegativeButton("No") { dialog: DialogInterface?, _ ->
                dialog?.cancel()
            }
            .create()
    }

}