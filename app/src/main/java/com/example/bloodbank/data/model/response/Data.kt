package com.example.bloodbank.data.model.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Data (
    @SerializedName("api_token")
    @Expose
    var apiToken: String,
    @SerializedName("client")
    @Expose
    var client: Client
)