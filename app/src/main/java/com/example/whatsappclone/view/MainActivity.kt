package com.example.whatsappclone.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.viewpager.widget.ViewPager
import com.example.whatsappclone.R
import com.example.whatsappclone.databinding.ActivityMainBinding
import com.example.whatsappclone.ui.adapter.SectionsPagerAdapter
import com.example.whatsappclone.ui.fragments.CallFragment
import com.example.whatsappclone.ui.fragments.ChatsFragment
import com.example.whatsappclone.ui.fragments.StatusFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setUpWithViewPager(binding.viewpager)
        binding.tabLayout.setupWithViewPager(binding.viewpager)
        setSupportActionBar(binding.toolbar)

        binding.viewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                fabIcon(position)
            }

            override fun onPageScrollStateChanged(state: Int) {

            }

        })


    }

    private fun setUpWithViewPager(viewPager: ViewPager) {
        val adapter = SectionsPagerAdapter(supportFragmentManager)
        val chatsFragment = ChatsFragment()
        val statusFragment = StatusFragment()
        val callFragment = CallFragment()
        adapter.addFragment(chatsFragment, "Chats")
        adapter.addFragment(statusFragment, "Status")
        adapter.addFragment(callFragment, "Calls")
        viewPager.adapter = adapter
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        var id = item.itemId

        when (id) {
            R.id.menu_search -> Toast.makeText(this, "Action Search", Toast.LENGTH_SHORT).show()
            R.id.more -> Toast.makeText(this, "Action More", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }


    fun fabIcon(index: Int) {

        Handler().postDelayed({
        when(index){
            0 -> binding.fabAction.setImageResource(R.drawable.message_ic)
            1 -> binding.fabAction.setImageResource(R.drawable.camera_ic)
            2 -> binding.fabAction.setImageResource(R.drawable.call_ic)
        }
            binding.fabAction.show()
        }, 200)

    }
}