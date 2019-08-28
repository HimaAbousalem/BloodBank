package com.example.bloodbank.data.repository

import com.example.bloodbank.data.model.request.LoginRequest
import com.example.bloodbank.data.model.request.RegisterRequest
import com.example.bloodbank.data.model.response.AuthenticationResponse
import io.reactivex.Observable
import io.reactivex.Single

interface AuthenticationRepository{
    fun registerUser(registerRequest: RegisterRequest): AuthenticationResponse
    fun signInUser(loginRequest: LoginRequest): Observable<AuthenticationResponse>
}