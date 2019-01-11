package com.daggertest2.di.component

import com.daggertest2.di.module.PersonModule
import com.daggertest2.mvp.view.fragment.TestFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [(PersonModule::class)])
interface TestFragmentSub:AndroidInjector<TestFragment>{
    @Subcomponent.Builder
    abstract class Builder:AndroidInjector.Builder<TestFragment>()
}