package com.daggertest2.di.component

import com.daggertest2.MyApp
import com.daggertest2.di.module.ActivityModule
import com.daggertest2.di.module.FragmentModule
import dagger.Component

@Component(modules = [(ActivityModule::class), (FragmentModule::class)])
interface ApplicationSub {
    fun inject(app: MyApp)
}