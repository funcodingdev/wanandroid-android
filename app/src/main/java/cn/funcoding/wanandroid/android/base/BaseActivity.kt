package cn.funcoding.wanandroid.android.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayResId())
        initView()
    }

    @LayoutRes
    abstract fun getLayResId(): Int

    abstract fun initView()
}