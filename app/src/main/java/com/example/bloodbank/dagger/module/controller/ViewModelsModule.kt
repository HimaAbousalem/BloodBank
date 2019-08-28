package com.example.bloodbank.dagger.module.controller

import androidx.lifecycle.ViewModel
import com.example.bloodbank.dagger.scope.ViewModelKey
import com.example.bloodbank.ui.viewmodel.LoginViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelsModule{
    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    internal abstract fun loginViewModel(viewModel: LoginViewModel): ViewModel
}