package com.daggertest2.di.module

import com.daggertest2.mvp.model.Person
import dagger.Module
import dagger.Provides

@Module
class PersonModule {
    @Provides
    fun providePerson(): Person = Person()
}