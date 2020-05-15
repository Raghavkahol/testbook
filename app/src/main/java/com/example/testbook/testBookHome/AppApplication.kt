package com.example.testbook.testBookHome

import android.app.Application
import androidx.lifecycle.LifecycleObserver
import com.example.testbook.testBookHome.di.component.ApplicationComponent

class AppApplication : Application(), LifecycleObserver {

    private var mComponent: ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()

    }
}