package com.example.testbook.testBookHome.di.service

import androidx.lifecycle.MutableLiveData
import com.example.testbook.testBookHome.model.home.CourseData
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("popular-courses")
    suspend fun getData(@Query("isPremium") isPremium : Boolean, @Query("includeIndividual") includeIndividual : Boolean): MutableLiveData<CourseData>

}