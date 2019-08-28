package com.example.bloodbank.dagger.module.app

import androidx.lifecycle.ViewModelProvider
import com.example.bloodbank.ui.base.ViewModelProvidersFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule{
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelProvidersFactory): ViewModelProvider.Factory
}