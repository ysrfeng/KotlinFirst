package com.ysr.kotlin.bean

/**
 * Created by ysr on 2017/6/9 17:17.
 * 邮箱 ysr200808@163.com
 */
class UserData {
    constructor(login: String, id: Int) {
        this.login = login
        this.id = id
    }
    override fun toString(): String {
        return ""+login
    }
    var login: String? = null
    var id: Int = 0
    var avatar_url: String? = null
    var gravatar_id: String? = null
    var url: String? = null
    var html_url: String? = null
    var followers_url: String? = null
    var following_url: String? = null
    var gists_url: String? = null
    var starred_url: String? = null
    var subscriptions_url: String? = null
    var organizations_url: String? = null
    var repos_url: String? = null
    var events_url: String? = null
    var received_events_url: String? = null
    var type: String? = null
    var isSite_admin: Boolean = false
}

