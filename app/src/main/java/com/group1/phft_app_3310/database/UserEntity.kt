package com.group1.phft_app_3310.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.group1.phft_app_3310.User_logic.UserType


@Entity(tableName = "User")
data class UserEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val firstName : String,
    val lastNAme: String,
    val email: String,
    val weight: Int? = null,
    val height: Float? = null,
    val type: String
)
