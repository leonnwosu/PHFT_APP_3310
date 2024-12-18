package com.group1.phft_app_3310.payment

import androidx.room.Entity
import androidx.room.ForeignKey
import com.group1.phft_app_3310.User_logic.User


data class payment_method(
    val userid : String,
    val method: String,
    val cardNumber: String? = null,
    val expDate: String? = null,
    val paypalAccount: String? = null,
    val bankAccount: String? = null
)
