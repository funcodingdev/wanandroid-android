package cn.funcoding.wanandroid.android.ui.home.project

import cn.funcoding.wanandroid.android.R
import cn.funcoding.wanandroid.android.base.BaseFragment

/**
 * 项目界面
 */
class ProjectFragment : BaseFragment() {

    override fun getLayResId(): Int = R.layout.fragment_project

    companion object {

        @JvmStatic
        fun newInstance() = ProjectFragment()
    }
}