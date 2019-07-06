package com.example.bloodbank.dagger.module.controller

import android.app.Activity
import android.content.Context
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.example.bloodbank.dagger.scope.ActivityScope
import dagger.Module
import dagger.Provides

@Module
class ControllerModule(private val mActivity: FragmentActivity){

    @ActivityScope
    @Provides
    fun provideContext():Context{
        return mActivity
    }
    @ActivityScope
    @Provides
    fun provideActivity():Activity{
        return mActivity
    }
    @ActivityScope
    @Provides
    fun provideFragmentManager(): FragmentManager {
        return mActivity.supportFragmentManager
    }
}
