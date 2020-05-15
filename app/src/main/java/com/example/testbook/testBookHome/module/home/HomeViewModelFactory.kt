package com.example.testbook.testBookHome.module.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.testbook.testBookHome.di.service.ApiService

class HomeViewModelFactory(private var apiService: ApiService) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HomeViewModel(apiService) as T
    }
}
