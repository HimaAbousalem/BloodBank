package com.example.bloodbank.dagger.component

import com.example.bloodbank.dagger.module.controller.MainModule
import com.example.bloodbank.dagger.module.controller.ControllerModule
import com.example.bloodbank.dagger.scope.ActivityScope
import com.example.bloodbank.ui.activity.AuthenticationActivity
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ControllerModule::class, MainModule::class])
interface ControllerComponent{
    fun inject(activity: AuthenticationActivity)
}
