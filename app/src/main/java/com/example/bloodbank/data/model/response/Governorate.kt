package com.example.bloodbank.data.model.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Governorate (
    @SerializedName("id")
    @Expose
    var id: Int,
    @SerializedName("created_at")
    @Expose
    var createdAt: String,
    @SerializedName("updated_at")
    @Expose
    var updatedAt: String,
    @SerializedName("name")
    @Expose
    var name: String
)
