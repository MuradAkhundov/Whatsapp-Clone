package com.muradakhundov.wpclone.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.muradakhundov.wpclone.R
import com.muradakhundov.wpclone.view.startup.WelcomeScreenActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Handler().postDelayed({
            startActivity(Intent(this, WelcomeScreenActivity::class.java))
            finish()
        }, 700)
        setContentView(R.layout.activity_splash)
    }
}