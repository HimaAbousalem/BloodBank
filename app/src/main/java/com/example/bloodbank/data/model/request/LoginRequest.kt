package com.example.bloodbank.data.model.request

import com.google.gson.annotations.Expose

data class LoginRequest(
    @Expose
    var phone: String,
    @Expose
    var password: String
)
