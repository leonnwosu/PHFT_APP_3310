package com.group1.phft_app_3310

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.home_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun subscription(view: View) {
        val intent = Intent(this, subscription_page::class.java)
        startActivity(intent)
    }

    fun chat(view: View) {
        val intent = Intent(this, Chat_page::class.java)
        startActivity(intent)
    }

    fun activity(view: View) {
        val intent = Intent(this, Activity_page::class.java)
        startActivity(intent)
    }

    fun fitnessGoals(view: View) {
        val intent = Intent(this, fitnessgoals_page::class.java)
        startActivity(intent)
    }

    fun trainer(view: View) {
        val intent = Intent(this, trainer_page::class.java)
        startActivity(intent)
    }

    fun logout(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}