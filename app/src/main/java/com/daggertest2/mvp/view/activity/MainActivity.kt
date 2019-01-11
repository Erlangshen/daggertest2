package com.daggertest2.mvp.view.activity

import android.os.Bundle
import android.util.Log
import com.daggertest2.R
import com.daggertest2.mvp.model.Student
import com.daggertest2.mvp.view.base.BaseActivity
import com.daggertest2.mvp.view.fragment.TestFragment
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity() {
    @Inject
    lateinit var stu: Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        stuTv.text = stu.toString()
        var fTran = supportFragmentManager.beginTransaction()
        fTran.add(R.id.fragLinear, TestFragment())
        fTran.commit()
    }
}
