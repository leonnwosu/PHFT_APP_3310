package com.group1.phft_app_3310.payment

data class payment_method(
    val method: String,
    val cardNumber: String? = null,
    val expDate: String? = null,
    val paypalAccount: String? = null,
    val bankAccount: String? = null
)
