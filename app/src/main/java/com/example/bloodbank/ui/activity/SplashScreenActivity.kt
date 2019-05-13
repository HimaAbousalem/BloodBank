package com.example.bloodbank.ui.activity

import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.os.Bundle

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, WelcomeActivity::class.java))
        finish()
    }
}
