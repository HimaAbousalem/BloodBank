package com.example.bloodbank.dagger.module.controller

import android.app.Activity
import android.content.Context
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProviders
import com.example.bloodbank.dagger.scope.ControllerScope
import com.example.bloodbank.ui.viewmodel.LoginViewModel
import dagger.Module
import dagger.Provides

@Module
class ControllerModule(private val mActivity: FragmentActivity){

    @ControllerScope
    @Provides
    fun provideContext():Context{
        return mActivity
    }
    @ControllerScope
    @Provides
    fun provideActivity():Activity{
        return mActivity
    }
    @ControllerScope
    @Provides
    fun provideFragmentManager(): FragmentManager {
        return mActivity.supportFragmentManager
    }
}
