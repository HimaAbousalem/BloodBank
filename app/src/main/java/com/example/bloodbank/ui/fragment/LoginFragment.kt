package com.example.bloodbank.ui.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bloodbank.R
import com.example.bloodbank.callback.ISwitchFragments
import com.example.bloodbank.ui.activity.MainActivity
import com.example.bloodbank.ui.base.BaseFragment
import com.example.bloodbank.utils.FORGET_PASSWORD_FRAGMENT
import com.example.bloodbank.utils.SIGNUP_FRAGMENT
import kotlinx.android.synthetic.main.fragment_login.view.*
import java.lang.RuntimeException

class LoginFragment : BaseFragment() {
    var listener: ISwitchFragments?=null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_login, container, false)
        rootView.Login_Fragment_Login_Btn.setOnClickListener {
            //TODO: validate input then loginFragment.
            startActivity(Intent(activity, MainActivity::class.java))
        }
        rootView.Login_Fragment_SignUp_Btn.setOnClickListener { listener!!.switchFragment(SIGNUP_FRAGMENT) }
        rootView.Login_Fragment_Forget_Password_Text_View.setOnClickListener { listener!!.switchFragment(FORGET_PASSWORD_FRAGMENT) }
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