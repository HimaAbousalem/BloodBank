package com.example.bloodbank.ui.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import com.example.bloodbank.data.model.request.LoginRequest
import com.example.bloodbank.data.model.response.AuthenticationStates
import com.example.bloodbank.data.model.response.ErrorState
import com.example.bloodbank.data.model.response.LoadingState
import com.example.bloodbank.data.model.response.Success
import com.example.bloodbank.data.repository.UserRepository
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class LoginViewModel @Inject constructor(private val userRepository: UserRepository): ViewModel(){

    fun signInUser(loginRequest: LoginRequest): Observable<AuthenticationStates> =
         userRepository.signInUser(loginRequest)
                .map<AuthenticationStates>{
                    signInResponse-> Success(signInResponse)
                }
                .onErrorReturn {
                    ErrorState(it.message?:"Please Check your Internet")
                }
                .startWith(Observable.just<AuthenticationStates>( // end with
                        LoadingState(loading = true)
                ))
                .concatWith(Observable.just<AuthenticationStates>( // end with
                        LoadingState(loading = false)
                ))
}
