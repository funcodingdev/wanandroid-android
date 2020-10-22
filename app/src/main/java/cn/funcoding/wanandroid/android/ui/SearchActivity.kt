package cn.funcoding.wanandroid.android.ui

import android.content.Context
import android.content.Intent
import cn.funcoding.wanandroid.android.R
import cn.funcoding.wanandroid.android.base.BaseActivity

class SearchActivity : BaseActivity() {

    companion object {
        @JvmStatic
        fun show(context: Context) {
            context.startActivity(Intent(context, SearchActivity::class.java))
        }
    }

    override fun getLayResId(): Int = R.layout.activity_search

    override fun initView() {
    }
}