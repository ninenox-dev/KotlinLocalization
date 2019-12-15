package com.ninenox.kotlinmultilanguage

import android.app.Application
import android.content.Context
import android.content.res.Configuration

class App : Application() {

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