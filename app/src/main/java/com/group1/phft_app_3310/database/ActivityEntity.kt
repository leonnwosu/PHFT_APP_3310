package com.group1.phft_app_3310.database

import androidx.room.Entity
import androidx.room.ForeignKey
import com.group1.phft_app_3310.User_logic.User


@Entity(
    tableName = "ActivityENtity",
    foreignKeys = [androidx.room.ForeignKey(
        entity = User::class,
        parentColumns = ["id"],
        childColumns = ["userId"],
        onDelete = ForeignKey.CASCADE
    )]
    )
data class ActivityEntity(
    val userId: Int,
    val type: String,
    val time: String,
    val caloriesBurned: Int
)
