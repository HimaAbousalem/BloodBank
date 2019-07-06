package com.example.bloodbank

import android.app.Application
import com.example.bloodbank.dagger.component.ApplicationComponent
import com.example.bloodbank.dagger.component.DaggerApplicationComponent
import com.example.bloodbank.dagger.module.app.ApplicationModule

class BloodApplication : Application() {
    lateinit var component: ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        component = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
        component.inject(this)
    }
}
