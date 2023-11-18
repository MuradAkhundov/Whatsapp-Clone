package com.muradakhundov.wpclone.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.muradakhundov.wpclone.menu.CallFragment
import com.muradakhundov.wpclone.menu.ChatsFragment
import com.muradakhundov.wpclone.menu.StatusFragment

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