package com.example.bloodbank.dagger.component

import com.example.bloodbank.BloodApplication
import com.example.bloodbank.dagger.module.controller.ControllerModule
import com.example.bloodbank.dagger.module.app.ApiServiceModule
import com.example.bloodbank.dagger.module.app.ViewModelFactoryModule
import com.example.bloodbank.dagger.scope.ApplicationScope
import dagger.Component

@ApplicationScope
@Component(modules = [ApiServiceModule::class, ViewModelFactoryModule::class])
interface ApplicationComponent {
    fun controllerComponent(controllerModule: ControllerModule):ControllerComponent
    fun inject(app: BloodApplication)
}
