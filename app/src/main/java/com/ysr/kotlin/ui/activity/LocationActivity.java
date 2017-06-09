package com.ysr.kotlin.ui.activity;

import com.ysr.kotlin.app.bean.UserInfo;
import com.ysr.kotlin.base.BaseActivity;
import com.ysr.kotlinfirst.R;
import com.ysr.lib.utils.LogUtils;

public class LocationActivity extends BaseActivity {


    @Override
    public int getLayoutId() {
        return R.layout.activity_location;
    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void initview() {
        UserInfo info = new UserInfo(0.9);
        LogUtils.loge(info.getSice()+"");
    }
}
