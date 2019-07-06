package com.example.bloodbank.ui.activity

import android.content.Intent
import android.os.Bundle
import com.example.bloodbank.ui.base.BaseActivity

class SplashScreenActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, WelcomeActivity::class.java))
        finish()
    }
}
