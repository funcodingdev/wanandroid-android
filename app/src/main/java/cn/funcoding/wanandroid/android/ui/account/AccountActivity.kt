package cn.funcoding.wanandroid.android.ui.account

import android.content.Context
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import cn.funcoding.wanandroid.android.R
import cn.funcoding.wanandroid.android.base.BaseActivity
import kotlinx.android.synthetic.main.activity_account.*

/**
 * 登陆注册界面
 */
class AccountActivity : BaseActivity() {
    private lateinit var loginFragment: LoginFragment
    private lateinit var registerFragment: RegisterFragment

    companion object {
        fun show(context: Context) {
            context.startActivity(Intent(context, AccountActivity::class.java))
        }
    }

    override fun getLayResId(): Int = R.layout.activity_account

    override fun initView() {
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener {
            finish()
        }
        supportActionBar?.run {
            setDisplayShowTitleEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        goLogin()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.account_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_go_register -> {
                if (item.title == getString(R.string.label_go_login)) {
                    item.title = getString(R.string.label_go_register)
                    goLogin()
                } else if (item.title == getString(R.string.label_go_register)) {
                    item.title = getString(R.string.label_go_login)
                    goRegister()
                }
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun goRegister() {
        supportActionBar?.title = getString(R.string.label_register)
        if (!this::registerFragment.isInitialized) {
            registerFragment = RegisterFragment()
        }
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, registerFragment)
            .commit()
    }

    private fun goLogin() {
        supportActionBar?.title = getString(R.string.label_login)
        if (!this::loginFragment.isInitialized) {
            loginFragment = LoginFragment()
        }
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, loginFragment)
            .commit()
    }
}