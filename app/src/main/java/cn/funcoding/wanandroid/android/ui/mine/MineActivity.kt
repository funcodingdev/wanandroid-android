package cn.funcoding.wanandroid.android.ui.mine

import android.content.Context
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import cn.funcoding.wanandroid.android.R
import cn.funcoding.wanandroid.android.base.BaseActivity
import kotlinx.android.synthetic.main.activity_mine.*

class MineActivity : BaseActivity() {

    companion object {
        @JvmStatic
        fun show(context: Context) {
            context.startActivity(Intent(context, MineActivity::class.java))
        }
    }

    override fun getLayResId(): Int = R.layout.activity_mine

    override fun initView() {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mine_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                finish()
                true
            }
            R.id.action_setting ->{
                SettingActivity.show(this)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}