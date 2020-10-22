package cn.funcoding.wanandroid.android.ui.home.plaza

import cn.funcoding.wanandroid.android.R
import cn.funcoding.wanandroid.android.base.BaseFragment

/**
 * 广场界面
 */
class PlazaFragment : BaseFragment() {

    override fun getLayResId(): Int = R.layout.fragment_plaza

    companion object {
        @JvmStatic
        fun newInstance() = PlazaFragment()
    }
}