package com.group1.phft_app_3310
import android.content.Intent
import android.widget.Button

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.startup_page) // Links to the new XML layout


        val signUpButton: Button = findViewById(R.id.btnSignUp)
        signUpButton.setOnClickListener {
            // Navigate to SignUpActivity when SignUp button is clicked
            val intent = Intent(this, home_screen::class.java)
            startActivity(intent)
        }

        // Set up the Login button
        val login_btn: Button = findViewById(R.id.btnLogin)
        login_btn.setOnClickListener {
            // Navigate to LoginActivity when Login button is clicked
            val intent = Intent(this, subscription_page::class.java)
            startActivity(intent)
        }

    }





}


