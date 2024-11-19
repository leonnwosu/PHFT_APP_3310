package com.group1.phft_app_3310.fitness_goals

import androidx.room.Entity
import java.util.Date



data class fitnessGoals(
    val userId: Int,
    val goalDescription: String,
    val targetDate: Date,
    val status : Boolean

)
