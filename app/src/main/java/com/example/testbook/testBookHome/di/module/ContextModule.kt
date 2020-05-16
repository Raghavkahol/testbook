package com.example.testbook.testBookHome.di.module

import android.content.Context
import com.example.testbook.testBookHome.di.qualifier.ApplicationContext
import com.example.testbook.testBookHome.di.scope.ApplicationScoped
import dagger.Module
import dagger.Provides

@Module
class ContextModule(context: Context) {

    private lateinit var context: Context

    init {
        this.context = context
    }

    @Provides
    @ApplicationContext
    @ApplicationScoped
    fun context(): Context {
        return this.context
    }
}