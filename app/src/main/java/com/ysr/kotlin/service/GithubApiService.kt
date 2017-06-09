package com.ysr.kotlin.service

import com.ysr.kotlin.ui.Result

import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by ysr on 2017/6/9 15:46.
 * 邮箱 ysr200808@163.com
 */

interface GithubApiService {
    @GET("search/users")
    fun search(@Query("q") query: String, @Query("page") page: Int, @Query("per_page") perPage: Int): Observable<Result>

    /**
     * Factory class for convenient creation of the Api Service interface
     */
    object Factory {

        fun create(): GithubApiService {
            val retrofit = Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://api.github.com/")
                    .build()

            return retrofit.create(GithubApiService::class.java)
        }
    }
}
