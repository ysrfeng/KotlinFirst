package com.ysr.kotlinfirst;

import com.ysr.kotlin.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {

    override fun initPresenter() {

    }

    override fun initview() {
        tv_title.text = "kotin"
        bt_post.setOnClickListener { tv_title.text = "post" }
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }
}