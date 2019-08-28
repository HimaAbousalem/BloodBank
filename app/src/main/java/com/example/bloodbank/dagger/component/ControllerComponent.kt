package com.example.bloodbank.dagger.component

import com.example.bloodbank.dagger.module.controller.MainModule
import com.example.bloodbank.dagger.module.controller.ControllerModule
import com.example.bloodbank.dagger.module.app.ViewModelFactoryModule
import com.example.bloodbank.dagger.module.controller.ViewModelsModule
import com.example.bloodbank.dagger.scope.ControllerScope
import com.example.bloodbank.ui.activity.AuthenticationActivity
import com.example.bloodbank.ui.fragment.LoginFragment
import dagger.Subcomponent

@ControllerScope
@Subcomponent(modules = [ControllerModule::class, MainModule::class, ViewModelsModule::class])
interface ControllerComponent{
    fun inject(activity: AuthenticationActivity)
    fun inject(fragment: LoginFragment)
}
