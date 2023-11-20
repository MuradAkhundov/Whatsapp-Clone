package com.muradakhundov.wpcloneapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.muradakhundov.wpcloneapp.R
import com.muradakhundov.wpcloneapp.adapter.SectionsPagerAdapter
import com.muradakhundov.wpcloneapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val adapter = SectionsPagerAdapter(this, 3)
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Chats"
                1 -> tab.text = "Status"
                2 -> tab.text = "Calls"
            }
        }.attach()

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                changeFabIconDrawable(position)
            }
        })

        setSupportActionBar(binding.toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        when (id) {
            R.id.menu_search -> Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()
            R.id.menu_more -> Toast.makeText(this, "More", Toast.LENGTH_SHORT).show()

        }
        return super.onOptionsItemSelected(item)

    }

    fun changeFabIconDrawable(index: Int) {
        with(binding) {
            Handler().postDelayed({
                when (index) {
                    0 -> fabBtn.setImageDrawable(ContextCompat.getDrawable(this@MainActivity,
                        R.drawable.chat_ic
                    ))
                    1 -> fabBtn.setImageDrawable(ContextCompat.getDrawable(this@MainActivity,
                        R.drawable.camera_ic
                    ))
                    2 -> fabBtn.setImageDrawable(ContextCompat.getDrawable(this@MainActivity,
                        R.drawable.call_ic
                    ))
                }
            }, 200)
        }
    }
}