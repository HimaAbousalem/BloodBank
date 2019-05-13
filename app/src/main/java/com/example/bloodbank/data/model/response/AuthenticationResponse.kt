package com.example.bloodbank.data.model.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class AuthenticationResponse (
    @SerializedName("status")
    @Expose
    var status: Int,
    @SerializedName("msg")
    @Expose
    var msg: String,
    @SerializedName("data")
    @Expose
    var data: Data
)
