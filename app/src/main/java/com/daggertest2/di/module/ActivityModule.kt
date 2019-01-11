package com.daggertest2.di.module

import android.app.Activity
import com.daggertest2.di.component.MainActivitySub
import com.daggertest2.mvp.view.activity.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [(MainActivitySub::class)])
abstract class ActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivity(builder: MainActivitySub.Builder): AndroidInjector.Factory<out Activity>
}