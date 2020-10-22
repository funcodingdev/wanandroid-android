package cn.funcoding.wanandroid.android.ui.home.wx

import cn.funcoding.wanandroid.android.R
import cn.funcoding.wanandroid.android.base.BaseFragment

/**
 * 公众号界面
 */
class WxFragment : BaseFragment() {

    override fun getLayResId(): Int = R.layout.fragment_wx

    companion object {
        @JvmStatic
        fun newInstance() = WxFragment()
    }
}