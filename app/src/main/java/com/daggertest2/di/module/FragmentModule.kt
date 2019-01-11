package com.daggertest2.di.module

import android.support.v4.app.Fragment
import com.daggertest2.di.component.TestFragmentSub
import com.daggertest2.mvp.view.fragment.TestFragment
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.support.FragmentKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [(TestFragmentSub::class)])
abstract class FragmentModule {
    @Binds
    @IntoMap
    @FragmentKey(TestFragment::class)
    abstract fun bindTestFragment(builder: TestFragmentSub.Builder): AndroidInjector.Factory<out Fragment>
}