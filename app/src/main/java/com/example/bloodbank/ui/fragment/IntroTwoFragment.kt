package com.example.bloodbank.ui.fragment

import android.os.Bundle

import androidx.fragment.app.Fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.bloodbank.R
import kotlinx.android.synthetic.main.fragment_intro.view.*

class IntroTwoFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_intro, container, false)
        rootView.Intro_Image.setImageResource(R.drawable.intro2)
        return rootView
    }

}
