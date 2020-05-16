package com.example.testbook.testBookHome.module.home

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testbook.testBookHome.di.service.ApiService
import com.example.testbook.testBookHome.model.home.CourseData
import com.example.testbook.testBookHome.model.home.Info
import kotlinx.coroutines.launch

class HomeViewModel(private val apiService: ApiService) : ViewModel() {

    private val _dataLoading = MutableLiveData<Boolean>()
    val dataLoading: LiveData<Boolean> = _dataLoading

    var course  = ObservableArrayList<Info>()

    init {
        getCardsData()
    }

    private fun getCardsData() {
        _dataLoading.value = true
        viewModelScope.launch {
            val courseData=apiService.getData(true,true)
            courseData.data?.classes?.let { course.addAll(it) }
            _dataLoading.value = false
        }
    }
}