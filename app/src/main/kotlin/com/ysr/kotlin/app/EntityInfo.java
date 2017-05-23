package com.ysr.kotlin.app;

/**
 * Created by ysr on 2017/5/21 下午8:06.
 * 邮箱 ysr200808@163.com
 */

public class EntityInfo {
    private String userid;
    private String token;
    private String appid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {

        this.userid = userid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {

        this.token = token;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }
}
