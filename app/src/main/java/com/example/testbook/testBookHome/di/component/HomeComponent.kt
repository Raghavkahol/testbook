package com.example.testbook.testBookHome.di.component

import com.example.testbook.testBookHome.di.module.HomeModule
import com.example.testbook.testBookHome.di.scope.ActivityScoped
import com.example.testbook.testBookHome.module.home.HomeActivity
import dagger.Component

@ActivityScoped
@Component(dependencies = [ApplicationComponent::class], modules = [HomeModule::class])
interface HomeComponent {
    fun inject(homeActivity: HomeActivity)
}