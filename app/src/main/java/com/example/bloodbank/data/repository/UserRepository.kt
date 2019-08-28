package com.example.bloodbank.data.repository

import com.example.bloodbank.data.api.ApiServices
import com.example.bloodbank.data.model.request.LoginRequest
import com.example.bloodbank.data.model.request.RegisterRequest
import com.example.bloodbank.data.model.response.AuthenticationResponse
import com.example.bloodbank.data.model.response.AuthenticationStates
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject

class UserRepository @Inject constructor(private val service: ApiServices): AuthenticationRepository{
    override fun registerUser(registerRequest: RegisterRequest): AuthenticationResponse {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun signInUser(loginRequest: LoginRequest): Observable<AuthenticationResponse> {
        return service.loginRequest(loginRequest)
    }

}