package cn.funcoding.wanandroid.android.util

import android.util.Log

object WLog {
    private const val TAG = "WLog"

    fun i(log: Any) {
        if (isBasicType(log)) {
            Log.i(TAG, "$TAG: $log")
        }
    }

    fun e(log: Any) {
        if (isBasicType(log)) {
            Log.e(TAG, "$TAG: $log")
        }
    }

    private fun isBasicType(log: Any) = when (log) {
        is Int,
        is Float,
        is Double,
        is String,
        is Boolean -> true
        else -> false
    }
}