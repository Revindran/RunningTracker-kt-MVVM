package com.raveendran.runningapp.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "runner_table")
data class Run(
    var img: Bitmap? = null,
    var timeStamp: Long = 0L,
    var timeInMillis: Long = 0L,
    var avgSpeedInKmpl: Float = 0f,
    var distanceInMeter: Int = 0,
    var caloriesBurned: Int = 0
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
