package com.ysr.kotlin.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ysr on 2017/5/21 下午7:57.
 * 邮箱 ysr200808@163.com
 */

public abstract class BaseActivity extends AppCompatActivity {
    private Context context;
    private BaseApplication app;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(this.getLayoutId());
        context = this;

        this.initview();
        this.initPresenter();
    }

    //获取布局文件
    public abstract int getLayoutId();

    //简单页面无需mvp就不用管此方法即可,完美兼容各种实际场景的变通
    public abstract void initPresenter();

    //初始化view
    public abstract void initview();


}
