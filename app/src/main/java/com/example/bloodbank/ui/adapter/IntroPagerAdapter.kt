package com.example.bloodbank.ui.adapter

import com.example.bloodbank.ui.fragment.IntroOneFragment
import com.example.bloodbank.ui.fragment.IntroTwoFragment
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class IntroPagerAdapter(fm: FragmentManager, behavior: Int) : FragmentPagerAdapter(fm, behavior) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> IntroOneFragment()
            1 -> IntroTwoFragment()
            else -> IntroOneFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}
