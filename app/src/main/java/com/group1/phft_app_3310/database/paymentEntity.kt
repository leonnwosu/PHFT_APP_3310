package com.group1.phft_app_3310.database

import androidx.room.Entity
import androidx.room.ForeignKey
import com.group1.phft_app_3310.User_logic.User
import com.group1.phft_app_3310.payment.Subscription
import com.group1.phft_app_3310.payment.payment_method
import java.util.Date


@Entity(
    tableName = "paymentEntity",
    foreignKeys = [androidx.room.ForeignKey(
        entity = User::class,
        parentColumns = ["id"],
        childColumns = ["userId"],
        onDelete = ForeignKey.CASCADE
    )])
data class paymentEntity(
    val userId : Int,
    val subscriptionPlan: Subscription,   // Subscription plan (e.g., "Basic", "Premium")
    val amount: Double,             // Amount charged
    val paymentMethod: payment_method, // Payment method (using PaymentMethod class)
    val transactionId: String,     // Unique transaction ID
    val paymentDate: Date,          // Date of the payment
    val subscriptionStartDate: Date, // Start date of the subscription
    val subscriptionEndDate: Date,   // End date or renewal date
    val isActive: Boolean

)
