package com.ninenox.kotlinlocalemanager

import android.app.Application
import android.content.Context
import android.content.res.Configuration

open class ApplicationLocale : Application() {

    override fun attachBaseContext(base: Context) {
        localeManager = LocaleManager(base)
        super.attachBaseContext(localeManager!!.setLocale(base))
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        localeManager!!.setLocale(this)
    }

    companion object {
        // for the sake of simplicity. use DI in real apps instead
        var localeManager: LocaleManager? = null
    }
}