package com.group1.phft_app_3310.database

import androidx.room.Entity
import androidx.room.ForeignKey
import com.group1.phft_app_3310.User_logic.User
import java.util.Date


@Entity(
    tableName = "FitnessGoalEntity",
    foreignKeys = [androidx.room.ForeignKey(
        entity = User::class,
        parentColumns = ["id"],
        childColumns = ["userId"],
        onDelete = ForeignKey.CASCADE
    )]
    )
data class FitnessGoalsEntity(
    val userId: Int,
    val goalDescription: String,
    val targetDate: java.sql.Date,
    val status : String
)
