package com.example.whatsappclone.view.startup

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.animation.doOnEnd
import com.example.whatsappclone.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)

        binding.icon.alpha = 0f
        binding.textWP.alpha = 0f
        val iconAnimator = ObjectAnimator.ofFloat(binding.icon, "alpha", 0f, 1f)
        val textAnimator = ObjectAnimator.ofFloat(binding.textWP, "alpha", 0f, 1f)
        val animatorSet = AnimatorSet().apply {
            playTogether(iconAnimator, textAnimator)
            duration = 1500
            doOnEnd {
                val intent = Intent(this@SplashScreenActivity, WelcomeScreenActivity::class.java)
                startActivity(intent)
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                finish()
            }
        }
        animatorSet.start()

        setContentView(binding.root)

    }
}