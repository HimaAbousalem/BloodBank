package com.example.bloodbank.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle

import com.example.bloodbank.R
import com.example.bloodbank.ui.adapter.IntroPagerAdapter
import kotlinx.android.synthetic.main.activity_welcome.*


class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        Welcome_Activity_Pager.adapter = IntroPagerAdapter(supportFragmentManager, 0)
        Welcome_Activity_Skip.setOnClickListener{ openLoginActivity() }
    }

    private fun openLoginActivity() {
        startActivity(Intent(this, AuthenticationActivity::class.java))
        finish()
    }
}
