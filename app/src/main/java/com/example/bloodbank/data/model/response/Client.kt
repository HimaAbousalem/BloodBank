package com.example.bloodbank.data.model.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Client (

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
    var name: String,
    @SerializedName("email")
    @Expose
    var email: String,
    @SerializedName("birth_date")
    @Expose
    var birthDate: String,
    @SerializedName("city_id")
    @Expose
    var cityId: String,
    @SerializedName("phone")
    @Expose
    var phone: String,
    @SerializedName("donation_last_date")
    @Expose
    var donationLastDate: String,
    @SerializedName("blood_type_id")
    @Expose
    var bloodTypeId: String,
    @SerializedName("is_active")
    @Expose
    var isActive: String,
    @SerializedName("pin_code")
    @Expose
    var pinCode: Int,
    @SerializedName("city")
    @Expose
    var city: City,
    @SerializedName("blood_type")
    @Expose
    var bloodType: BloodType
)
