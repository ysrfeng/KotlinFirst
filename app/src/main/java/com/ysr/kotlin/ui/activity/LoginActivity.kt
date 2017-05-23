package com.ysr.kotlin.ui.activity

import android.support.design.widget.Snackbar
import com.umeng.analytics.MobclickAgent
import com.ysr.kotlin.base.BaseActivity
import com.ysr.kotlinfirst.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {
    override fun getLayoutId(): Int {
        return R.layout.activity_login
    }

    override fun initPresenter() {

    }

    override fun initview() {

        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }


}
