package com.ysr.kotlin.ui.activity

import com.ysr.kotlin.base.BaseActivity
import com.ysr.kotlin.service.GithubApiService
import com.ysr.kotlinfirst.R



class NewsActivity : BaseActivity() {
    override fun initPresenter() {

    }

    override fun initview() {
        val apiService = GithubApiService.Factory.create()
        apiService.search("kotlin",0,0)
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_news
    }


}
