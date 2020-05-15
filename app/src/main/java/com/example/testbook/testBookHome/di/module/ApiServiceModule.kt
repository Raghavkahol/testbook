package com.example.testbook.testBookHome.di.module

import com.example.testbook.testBookHome.di.qualifier.ApiServiceQualifier
import com.example.testbook.testBookHome.di.scope.ApplicationScoped
import com.example.testbook.testBookHome.di.service.ApiService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module(includes = arrayOf(NetworkModule::class))
class ApiServiceModule {
    fun getBaseUrl(): String {
        return "https://api.testbook.com/api/v1/"
    }

    @Provides
    @ApplicationScoped
    fun crsApiService(@ApiServiceQualifier retrofit: Retrofit): ApiService {
        return retrofit.create<ApiService>(ApiService::class.java)
    }

    @Provides
    @ApplicationScoped
    @ApiServiceQualifier
    fun provideRetrofit(httpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(getBaseUrl())
            .client(httpClient)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }
}