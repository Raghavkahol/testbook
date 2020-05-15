package com.example.testbook.testBookHome.di.module

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProviders
import com.example.testbook.testBookHome.di.scope.ActivityScoped
import com.example.testbook.testBookHome.di.service.ApiService
import com.example.testbook.testBookHome.module.home.HomeViewModel
import com.example.testbook.testBookHome.module.home.HomeViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class HomeModule(private val activity: FragmentActivity) {
    @ActivityScoped
    @Provides
    fun provideHometModel(rankingListViewModelFactory: HomeViewModelFactory): HomeViewModel {
        return ViewModelProviders.of(activity, rankingListViewModelFactory).get(HomeViewModel::class.java)
    }

    @ActivityScoped
    @Provides
    fun provideHomeViewModelFactory(apiService: ApiService): HomeViewModelFactory{
        return HomeViewModelFactory(apiService);
    }
}