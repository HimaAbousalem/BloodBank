package com.example.bloodbank.ui.base

import androidx.annotation.UiThread
import androidx.appcompat.app.AppCompatActivity
import com.example.bloodbank.BloodApplication
import com.example.bloodbank.dagger.component.ControllerComponent
import com.example.bloodbank.dagger.module.controller.ControllerModule


abstract class BaseActivity: AppCompatActivity(){
    @UiThread
    fun getActivityComponent(): ControllerComponent {
        return (application as BloodApplication).component
                .controllerComponent(ControllerModule(this))
    }
}