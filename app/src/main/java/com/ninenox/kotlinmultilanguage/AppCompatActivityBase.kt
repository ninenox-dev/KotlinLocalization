package com.ninenox.kotlinmultilanguage

import android.content.Context
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class AppCompatActivityBase : AppCompatActivity() {
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(App.localeManager!!.setLocale(base))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        resetTitle()
    }

    private fun resetTitle() {
        try {
            val label = packageManager.getActivityInfo(
                componentName,
                PackageManager.GET_META_DATA
            ).labelRes
            if (label != 0) {
                setTitle(label)
            }
        } catch (e: PackageManager.NameNotFoundException) {
        }
    }
}