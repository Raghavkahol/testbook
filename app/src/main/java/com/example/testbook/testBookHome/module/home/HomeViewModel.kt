package com.example.testbook.testBookHome.module.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testbook.testBookHome.di.service.ApiService
import com.example.testbook.testBookHome.model.home.CourseData
import kotlinx.coroutines.launch

class HomeViewModel(private val apiService: ApiService) : ViewModel() {

    private var _courseData  = MutableLiveData<CourseData>()
    var courseData  : LiveData<CourseData> = _courseData

    private val _dataLoading = MutableLiveData<Boolean>()
    val dataLoading: LiveData<Boolean> = _dataLoading

    init {
        getCardsData()
    }

    private fun getCardsData() {
        _dataLoading.value = true
        viewModelScope.launch {
            courseData=apiService.getData(true,true)
            _dataLoading.value = false
        }
    }
}