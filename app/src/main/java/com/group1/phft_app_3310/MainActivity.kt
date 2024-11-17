package com.group1.phft_app_3310
import android.content.Intent
import android.widget.Button
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.group1.phft_app_3310.ui.theme.PHFT_APP_3310Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Links to the new XML layout


        val signUpButton: Button = findViewById(R.id.btnSignUp)
        signUpButton.setOnClickListener {
            // Navigate to SignUpActivity when SignUp button is clicked
            val intent = Intent(this, sign_Up::class.java)
            startActivity(intent)
        }

        // Set up the Login button
        val login_btn: Button = findViewById(R.id.btnLogin)
        login_btn.setOnClickListener {
            // Navigate to LoginActivity when Login button is clicked
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

    }





}


