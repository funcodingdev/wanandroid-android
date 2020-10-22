package cn.funcoding.wanandroid.android.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import cn.funcoding.wanandroid.android.R
import cn.funcoding.wanandroid.android.base.BaseFragment
import cn.funcoding.wanandroid.android.ui.home.plaza.PlazaFragment
import cn.funcoding.wanandroid.android.ui.home.project.ProjectFragment
import cn.funcoding.wanandroid.android.ui.home.system.SystemFragment
import cn.funcoding.wanandroid.android.ui.home.wx.WxFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {

    private lateinit var fragmentList: List<Fragment>
    private lateinit var titles: List<String>

    override fun getLayResId(): Int = R.layout.fragment_home

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentList = listOf(
            PlazaFragment.newInstance("", ""),
            ProjectFragment.newInstance("", ""),
            SystemFragment.newInstance("", ""),
            WxFragment.newInstance("", "")
        )

        titles = listOf(
            getString(R.string.label_plaza),
            getString(R.string.label_project),
            getString(R.string.label_system),
            getString(R.string.label_wx)
        )

        homeViewPager.adapter =
            SimpleFragmentPagerAdapter(parentFragmentManager, fragmentList, titles)
        homeTabLayout.setupWithViewPager(homeViewPager)
    }
}