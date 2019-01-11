package com.daggertest2.di.module

import com.daggertest2.mvp.model.Student
import dagger.Module
import dagger.Provides

@Module
class StudentModule {
    @Provides
    fun provideStudent():Student = Student()
}