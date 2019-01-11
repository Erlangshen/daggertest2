package com.daggertest2.mvp.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.daggertest2.R
import com.daggertest2.mvp.model.Person
import com.daggertest2.mvp.view.base.BaseFragment
import kotlinx.android.synthetic.main.frag_layout.*
import javax.inject.Inject

class TestFragment : BaseFragment() {
    @Inject
    lateinit var per: Person

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.frag_layout, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        perTv.text = per.toString()
    }
}