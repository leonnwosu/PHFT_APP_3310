package com.group1.phft_app_3310.database

import androidx.room.Entity
import androidx.room.ForeignKey
import com.group1.phft_app_3310.User_logic.User


@Entity(
    tableName = "paymentMethodEntity",
    foreignKeys = [androidx.room.ForeignKey(
        entity = User::class,
        parentColumns = ["id"],
        childColumns = ["userId"],
        onDelete = ForeignKey.CASCADE
    )])
data class payment_methodEntity(
    val userId: Int,
    val method: String,
    val cardNumber: String? = null,
    val expDate: String? = null,
    val paypalAccount: String? = null,
    val bankAccount: String? = null
)
