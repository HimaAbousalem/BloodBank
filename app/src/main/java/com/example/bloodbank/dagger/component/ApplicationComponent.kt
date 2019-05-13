package com.example.bloodbank.dagger.component

import com.example.bloodbank.BloodApplication
import com.example.bloodbank.dagger.module.ApiServiceModule
import com.example.bloodbank.dagger.scope.ApplicationScope

import dagger.Component

@ApplicationScope
@Component(modules = [ApiServiceModule::class])
interface ApplicationComponent {
    fun inject(app: BloodApplication)
}
