package com.example.bloodbank.error

import okhttp3.Interceptor
import okhttp3.Response

class ErrorInterceptor : Interceptor{

    override fun intercept(chain: Interceptor.Chain): Response {
        val response = chain.proceed(chain.request())
        if(!response.isSuccessful){
            throw BloodBankException(
                    response.code(),
                    response.message()
            )
        }
        return response
    }

}