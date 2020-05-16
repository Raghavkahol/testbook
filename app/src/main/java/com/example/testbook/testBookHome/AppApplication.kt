package com.example.testbook.testBookHome

import android.app.Application
import androidx.lifecycle.LifecycleObserver
import com.example.testbook.testBookHome.AppApplication.HOLDER.mAppController
import com.example.testbook.testBookHome.di.component.ApplicationComponent
import com.example.testbook.testBookHome.di.component.DaggerApplicationComponent
import com.example.testbook.testBookHome.di.module.ContextModule

class AppApplication : Application(), LifecycleObserver {

    var mComponent: ApplicationComponent? = null

    private object HOLDER {
        var mAppController: AppApplication? = null
    }

    override fun onCreate() {
        super.onCreate()
        mComponent = DaggerApplicationComponent.builder().contextModule(ContextModule(this)).build()
        mAppController = this
    }

    companion object {
        fun getInstance(): AppApplication? {

            if (mAppController == null) {
                return null
            }
            return mAppController
        }
    }
}