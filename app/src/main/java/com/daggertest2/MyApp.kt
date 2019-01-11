package com.daggertest2

import android.app.Activity
import android.app.Application
import android.support.v4.app.Fragment
import com.daggertest2.di.component.DaggerApplicationSub
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject


class MyApp : Application(), HasActivityInjector, HasSupportFragmentInjector  {


    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>
    @Inject
    lateinit var fragmentInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate() {
        super.onCreate()
        DaggerApplicationSub.create().inject(this)
    }

    override fun activityInjector(): DispatchingAndroidInjector<Activity> {
        return activityInjector
    }

    override fun supportFragmentInjector(): DispatchingAndroidInjector<Fragment> {
        return fragmentInjector
    }
}