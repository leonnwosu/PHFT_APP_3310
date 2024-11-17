package com.group1.phft_app_3310.payment

import java.util.Date

data class payment(
    val userId: String,
    val subscriptionPlan: String,   // Subscription plan (e.g., "Basic", "Premium")
    val amount: Double,             // Amount charged
    val paymentMethod: payment_method, // Payment method (using PaymentMethod class)
    val paymentStatus: String,      // Payment status (e.g., "Completed", "Pending")
    val transactionId: String,     // Unique transaction ID
    val paymentDate: Date,          // Date of the payment
    val subscriptionStartDate: Date, // Start date of the subscription
    val subscriptionEndDate: Date,   // End date or renewal date
    val isActive: Boolean
)
