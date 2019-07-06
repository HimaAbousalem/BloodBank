package com.example.bloodbank.ui.fragment

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.bloodbank.R
import com.example.bloodbank.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_intro.view.*

class IntroOneFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_intro, container, false)
            rootView.Intro_Image.setImageResource(R.drawable.intro1)
        return rootView
    }
}
