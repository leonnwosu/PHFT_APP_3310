package com.group1.phft_app_3310.User_logic

import androidx.room.Entity
import androidx.room.PrimaryKey


data class User(
    val id: Int,
    val firstName : String,
    val lastNAme: String,
    val email: String,
    val weight: Int? = null,
    val height: Float? = null,
    val type: UserType



)
