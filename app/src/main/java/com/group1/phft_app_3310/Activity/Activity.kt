package com.group1.phft_app_3310.Activity

import android.health.connect.datatypes.ActiveCaloriesBurnedRecord
import androidx.room.Entity
import androidx.room.ForeignKey
import com.group1.phft_app_3310.User_logic.User
import kotlin.time.Duration


data class Activity(
    val userId: String,
    val type: ActivityType,
    val duration: Duration,
    val caloriesBurnedRecord: ActiveCaloriesBurnedRecord

)
