package com.example.bloodbank.data.model.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

import java.util.Date

data class RegisterRequest(
        @Expose
        var name: String,
        @Expose
        var email: String,
        @SerializedName("birth_date")
        @Expose
        var birthDate: Date,
        @SerializedName("city_id")
        @Expose
        var cityId: Int,
        @Expose
        var phone: String,
        @SerializedName("donation_last_date")
        @Expose
        var donationLastDate: Date,
        @Expose
        var password: String,
        @SerializedName("password_confirmation")
        @Expose
        var passwordConfirmation: String,
        @SerializedName("blood_type_id")
        @Expose
        var bloodTypeId: Int
)

