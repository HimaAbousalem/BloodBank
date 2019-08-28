package com.example.bloodbank.dagger.module.controller

import com.example.bloodbank.dagger.scope.ControllerScope
import com.example.bloodbank.ui.fragment.ChangePasswordFragment
import com.example.bloodbank.ui.fragment.ForgetPasswordFragment
import com.example.bloodbank.ui.fragment.LoginFragment
import com.example.bloodbank.ui.fragment.SignupFragment
import dagger.Module
import dagger.Provides

@Module
class MainModule{

    @ControllerScope
    @Provides
    fun provideLoginFragment():LoginFragment{
        return LoginFragment()
    }

    @ControllerScope
    @Provides
    fun provideSignupFragment():SignupFragment{
        return SignupFragment()
    }

    @ControllerScope
    @Provides
    fun provideForgetPasswordFragment():ForgetPasswordFragment{
        return ForgetPasswordFragment()
    }

    @ControllerScope
    @Provides
    fun provideChangePasswordFragment():ChangePasswordFragment{
        return ChangePasswordFragment()
    }
}