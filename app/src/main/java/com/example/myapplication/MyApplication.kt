package com.example.myapplication

import android.app.Application
import com.ogogo_libs.preflistener.PrefListener

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        PrefListener.init(this@MyApplication)
    }
}