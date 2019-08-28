package com.example.bloodbank.data.model.response

sealed class AuthenticationStates
data class LoadingState(var loading: Boolean = false): AuthenticationStates()
data class ErrorState(val message: String): AuthenticationStates()
data class Success(var data: AuthenticationResponse? = null): AuthenticationStates()