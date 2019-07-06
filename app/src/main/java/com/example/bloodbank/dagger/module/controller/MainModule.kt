package com.example.bloodbank.dagger.module.controller

import com.example.bloodbank.dagger.scope.ActivityScope
import com.example.bloodbank.ui.fragment.ChangePasswordFragment
import com.example.bloodbank.ui.fragment.ForgetPasswordFragment
import com.example.bloodbank.ui.fragment.LoginFragment
import com.example.bloodbank.ui.fragment.SignupFragment
import dagger.Module
import dagger.Provides

@Module
class MainModule{

    @ActivityScope
    @Provides
    fun provideLoginFragment():LoginFragment{
        return LoginFragment()
    }

    @ActivityScope
    @Provides
    fun provideSignupFragment():SignupFragment{
        return SignupFragment()
    }

    @ActivityScope
    @Provides
    fun provideForgetPasswordFragment():ForgetPasswordFragment{
        return ForgetPasswordFragment()
    }

    @ActivityScope
    @Provides
    fun provideChangePasswordFragment():ChangePasswordFragment{
        return ChangePasswordFragment()
    }
}