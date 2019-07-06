package com.example.bloodbank.data.api

import com.example.bloodbank.data.model.request.LoginRequest
import com.example.bloodbank.data.model.request.RegisterRequest
import com.example.bloodbank.data.model.response.AuthenticationResponse

import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiServices {

    @Headers("Content-Type: application/json")
    @POST("loginFragment")
    fun loginRequest(@Body request: LoginRequest): Single<AuthenticationResponse>

    @Headers("Content-Type: application/json")
    @POST("register")
    fun registerRequest(@Body request: RegisterRequest): Single<AuthenticationResponse>

//    @GET("governorates")
//    fun getGovernorates(): Single<>
}
