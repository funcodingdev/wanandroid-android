package cn.funcoding.wanandroid.android.ui

import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import cn.funcoding.wanandroid.android.R
import cn.funcoding.wanandroid.android.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun getLayResId(): Int = R.layout.activity_main

    override fun initView() {
        NavigationUI.setupWithNavController(bottomNav, navHost.findNavController())    }
}