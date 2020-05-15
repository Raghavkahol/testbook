package com.example.testbook.testBookHome.di.module

import dagger.Module

@Module(includes = arrayOf(ContextModule::class, ApiServiceModule::class))
class ApplicationModule {
    //provide dependancies that are required in Application level
}