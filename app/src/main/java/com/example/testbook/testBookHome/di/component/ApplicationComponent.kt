package com.example.testbook.testBookHome.di.component

import android.content.Context
import com.example.testbook.testBookHome.di.module.ApplicationModule
import com.example.testbook.testBookHome.di.qualifier.ApplicationContext
import com.example.testbook.testBookHome.di.scope.ApplicationScoped
import com.example.testbook.testBookHome.di.service.ApiService
import dagger.Component

@ApplicationScoped
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    @get:ApplicationContext
    val context: Context

    val apiService : ApiService
}