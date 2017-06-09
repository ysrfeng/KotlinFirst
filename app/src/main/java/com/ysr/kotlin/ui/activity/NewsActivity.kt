package com.ysr.kotlin.ui.activity

import com.ysr.kotlin.base.BaseActivity
import com.ysr.kotlin.bean.UserData
import com.ysr.kotlin.service.GithubApiService
import com.ysr.kotlinfirst.R
import com.ysr.lib.utils.LogUtils
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class NewsActivity : BaseActivity() {
    override fun initPresenter() {

    }

    override fun initview() {
        val repository = SearchRepositoryProvider.provideSearchRepository()
        repository.searchUsers()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({
                    result ->
                    LogUtils.loge(result.get(0).login.toString())
                }, { error ->
                    error.printStackTrace()
                })
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_news
    }

    object SearchRepositoryProvider {
        val apiService = GithubApiService.Factory.create()
        fun provideSearchRepository(): SearchRepository {
            return SearchRepository(apiService)
        }
    }

    class SearchRepository(val apiService: GithubApiService) {
        fun searchUsers(): Observable<List<UserData>> {
            return apiService.getStartGazers()
        }
    }
}
