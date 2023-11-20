package com.muradakhundov.wpcloneapp.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.muradakhundov.wpcloneapp.menu.CallFragment
import com.muradakhundov.wpcloneapp.menu.ChatsFragment
import com.muradakhundov.wpcloneapp.menu.StatusFragment

class SectionsPagerAdapter (
    var context: Context,
    var totalTabs: Int
) :
    FragmentStateAdapter(context as FragmentActivity) {

    override fun getItemCount(): Int {
        return totalTabs
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                ChatsFragment()
            }
            1 -> {
                StatusFragment()
            }
            2 -> {
                CallFragment()
            }
            else -> ChatsFragment()
        }
    }
}