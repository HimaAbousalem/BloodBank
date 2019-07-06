package com.example.bloodbank.dagger.module.app

import android.app.Application

import com.example.bloodbank.dagger.scope.ApplicationScope

import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val application: Application) {

    @ApplicationScope
    @Provides
    fun context(): Application {
        return application
    }

}
