package cn.funcoding.wanandroid.android.ui

import android.view.Menu
import android.view.MenuItem
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import cn.funcoding.wanandroid.android.R
import cn.funcoding.wanandroid.android.base.BaseActivity
import cn.funcoding.wanandroid.android.ui.search.SearchActivity
import cn.funcoding.wanandroid.android.ui.account.AccountActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 主界面
 */
class MainActivity : BaseActivity() {

    override fun getLayResId(): Int = R.layout.activity_main

    override fun initView() {
        setSupportActionBar(toolbar)
        // 初始化底部导航栏
        NavigationUI.setupWithNavController(bottomNav, navHost.findNavController())
        // 初始化头像、昵称
        avatars.setOnClickListener {
            showMinePage()
        }
        nickname.setOnClickListener {
            showMinePage()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_search -> {
                showSearchPage()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showMinePage() {
//        MineActivity.show(this)
        AccountActivity.show(this)
    }

    private fun showSearchPage() {
        SearchActivity.show(this)
    }
}