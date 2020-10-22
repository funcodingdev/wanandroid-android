package cn.funcoding.wanandroid.android.ui.home.system

import cn.funcoding.wanandroid.android.R
import cn.funcoding.wanandroid.android.base.BaseFragment

/**
 * 体系界面
 */
class SystemFragment : BaseFragment() {

    override fun getLayResId(): Int = R.layout.fragment_system

    companion object {
        @JvmStatic
        fun newInstance() = SystemFragment()
    }
}