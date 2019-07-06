package com.example.bloodbank.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bloodbank.R
import com.example.bloodbank.callback.ISwitchFragments
import com.example.bloodbank.ui.base.BaseFragment
import com.example.bloodbank.utils.CHANGE_PASSWORD_FRAGMENT
import kotlinx.android.synthetic.main.fragment_forget_password.view.*
import java.lang.RuntimeException

class ForgetPasswordFragment: BaseFragment() {
    var listener: ISwitchFragments?=null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_forget_password, container, false)
        rootView.Forget_Password_Send_button.setOnClickListener { listener!!.switchFragment(CHANGE_PASSWORD_FRAGMENT) }
        return rootView
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is ISwitchFragments){
            listener = context
        }else{
            throw RuntimeException(context.toString()+ "must implement ISwitchFragments")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}