package com.muradakhundov.wpclone.view.startup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muradakhundov.wpclone.view.MainActivity
import com.muradakhundov.wpclone.databinding.ActivityWelcomeScreenBinding
import com.muradakhundov.wpclone.view.auth.PhoneLoginActivity

class WelcomeScreenActivity : AppCompatActivity() {
    private lateinit var binding : ActivityWelcomeScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWelcomeScreenBinding.inflate(layoutInflater)

        binding.agree.setOnClickListener {
            startActivity(Intent(this, PhoneLoginActivity::class.java))
        }
        setContentView(binding.root)
    }
}