package com.daggertest2.di.component

import com.daggertest2.di.module.StudentModule
import com.daggertest2.mvp.view.activity.MainActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [(StudentModule::class)])
interface MainActivitySub : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder:AndroidInjector.Builder<MainActivity>()
}