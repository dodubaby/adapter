package com.example.adapter

import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex

class App : Application() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(base)
    }
}
