package com.example.whatsappclone.view.startup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whatsappclone.view.MainActivity
import com.example.whatsappclone.databinding.ActivityWelcomeScreenBinding
import com.example.whatsappclone.view.auth.PhoneLoginActivity

class WelcomeScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

      binding = ActivityWelcomeScreenBinding.inflate(layoutInflater)


        binding.buttonAgree.setOnClickListener {
            startActivity(Intent(this, PhoneLoginActivity::class.java))
        }

        setContentView(binding.root)
    }
}