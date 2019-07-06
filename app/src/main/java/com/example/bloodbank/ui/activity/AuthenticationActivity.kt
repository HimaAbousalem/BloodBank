package com.example.bloodbank.ui.activity

import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentManager.POP_BACK_STACK_INCLUSIVE

import com.example.bloodbank.R
import com.example.bloodbank.callback.ISwitchFragments
import com.example.bloodbank.dagger.component.ControllerComponent
import com.example.bloodbank.ui.base.BaseActivity
import com.example.bloodbank.ui.fragment.ChangePasswordFragment
import com.example.bloodbank.ui.fragment.ForgetPasswordFragment
import com.example.bloodbank.ui.fragment.LoginFragment
import com.example.bloodbank.ui.fragment.SignupFragment
import com.example.bloodbank.utils.CHANGE_PASSWORD_FRAGMENT
import com.example.bloodbank.utils.FORGET_PASSWORD_FRAGMENT
import com.example.bloodbank.utils.SIGNUP_FRAGMENT
import javax.inject.Inject

const val TAG = "Login"
class AuthenticationActivity : BaseActivity(), ISwitchFragments {

    @Inject
    lateinit var loginFragment: LoginFragment
    @Inject
    lateinit var signUpFragment: SignupFragment
    @Inject
    lateinit var forgetPasswordFragment: ForgetPasswordFragment
    @Inject
    lateinit var changePasswordFragment: ChangePasswordFragment
    @Inject
    lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)
        getActivityComponent().inject(this)
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.Authentication_Activity_Container, loginFragment).commit()
    }
    override fun switchFragment(fragments: Int) {
        when (fragments) {
            SIGNUP_FRAGMENT -> {
                fragmentManager.beginTransaction().replace(R.id.Authentication_Activity_Container, signUpFragment).addToBackStack(TAG).commit()
            }
            FORGET_PASSWORD_FRAGMENT -> {
                fragmentManager.beginTransaction().replace(R.id.Authentication_Activity_Container, forgetPasswordFragment).addToBackStack(TAG).commit()
            }
            CHANGE_PASSWORD_FRAGMENT ->{
                fragmentManager.beginTransaction().replace(R.id.Authentication_Activity_Container, changePasswordFragment).addToBackStack(TAG).commit()
            }
        }
    }

    override fun onBackPressed() {
        if(fragmentManager.backStackEntryCount>0){
            fragmentManager.popBackStack(TAG, POP_BACK_STACK_INCLUSIVE)
        }else {
            super.onBackPressed()
        }
    }

}
