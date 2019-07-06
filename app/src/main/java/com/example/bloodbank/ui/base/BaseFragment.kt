package com.example.bloodbank.ui.base

import androidx.annotation.UiThread
import androidx.fragment.app.Fragment
import com.example.bloodbank.BloodApplication
import com.example.bloodbank.dagger.component.ControllerComponent
import com.example.bloodbank.dagger.module.controller.ControllerModule

abstract class BaseFragment: Fragment(){
    @UiThread
    fun getActivityComponent(): ControllerComponent {
        return (activity?.application as BloodApplication).component
                .controllerComponent(ControllerModule(activity!!))
    }
}