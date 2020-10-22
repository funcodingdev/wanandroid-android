package cn.funcoding.wanandroid.android.ui.mine

import android.content.Context
import android.content.Intent
import cn.funcoding.wanandroid.android.R
import cn.funcoding.wanandroid.android.base.BaseActivity

class SettingActivity : BaseActivity() {

    companion object {
        @JvmStatic
        fun show(context: Context) {
            context.startActivity(Intent(context, SettingActivity::class.java))
        }
    }

    override fun getLayResId(): Int = R.layout.activity_setting

    override fun initView() {
    }
}