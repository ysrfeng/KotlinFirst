package com.ysr.kotlin.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**基类activity
 * Created by ysr on 2017/5/18 下午5:46.
 * 邮箱 ysr200808@163.com
 */
abstract class  BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initview()
    }

    abstract fun initview()

}