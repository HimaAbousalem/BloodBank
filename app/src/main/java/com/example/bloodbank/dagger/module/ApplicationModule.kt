package com.example.bloodbank.dagger.module

import android.content.Context

import com.example.bloodbank.dagger.qualifier.ApplicationContext
import com.example.bloodbank.dagger.scope.ApplicationScope

import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val context: Context) {

    @ApplicationScope
    @ApplicationContext
    @Provides
    fun context(): Context {
        return context
    }

}
