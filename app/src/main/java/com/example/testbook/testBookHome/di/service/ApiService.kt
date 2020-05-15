package com.example.testbook.testBookHome.di.service

import com.example.testbook.testBookHome.model.home.CourseData
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/popular-courses")
    fun getData(@Query("isPremium") isPremium : Boolean, @Query("includeIndividual") includeIndividual : Boolean): Deferred<List<CourseData>>

}