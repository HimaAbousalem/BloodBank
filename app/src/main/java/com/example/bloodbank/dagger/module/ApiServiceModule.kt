package com.example.bloodbank.dagger.module

import com.example.bloodbank.data.api.ApiServices
import com.example.bloodbank.dagger.scope.ApplicationScope
import com.example.bloodbank.utils.BASE_URL
import com.google.gson.Gson
import com.google.gson.GsonBuilder

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

@Module(includes = [NetworkModule::class])
class ApiServiceModule {

    val gson: Gson
        @ApplicationScope
        @Provides
        get() = GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create()

    @ApplicationScope
    @Provides
    fun getMovieService(retrofit: Retrofit): ApiServices {
        return retrofit.create(ApiServices::class.java)
    }

    @ApplicationScope
    @Provides
    fun getRetrofit(okHttpClient: OkHttpClient, gson: Gson): Retrofit {
        return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
    }
}
