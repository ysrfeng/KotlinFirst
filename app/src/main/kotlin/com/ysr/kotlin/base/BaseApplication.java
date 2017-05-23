package com.ysr.kotlin.base;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.support.multidex.MultiDex;

import com.ysr.kotlin.app.EntityInfo;
import com.ysr.kotlinfirst.BuildConfig;
import com.ysr.lib.utils.LogUtils;

/**
 * Created by ysr on 2017/5/21 下午8:04.
 * 邮箱 ysr200808@163.com
 */

public class BaseApplication extends Application {
    private static BaseApplication baseApplication;
    private EntityInfo entity;

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;

        //初始化logger
        LogUtils.logInit(BuildConfig.LOG_DEBUG);
    }

    public static Context getAppContext() {
        if (null == baseApplication) {
            throw new RuntimeException("必须先实例化Application");
        }
        return baseApplication;
    }

    public static BaseApplication getInstance() {
        if (null == baseApplication) {
            throw new RuntimeException("必须先实例化Application");
        }
        return baseApplication;
    }

    public static Resources getAppResources() {
        return baseApplication.getResources();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    /**
     * 分包
     *
     * @param base
     */
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    public EntityInfo getInfo() {
        if (entity == null) {
            entity = new EntityInfo();
        }
        return entity;
    }

    public void setInfo(EntityInfo entity) {
        this.entity = entity;
    }
}
