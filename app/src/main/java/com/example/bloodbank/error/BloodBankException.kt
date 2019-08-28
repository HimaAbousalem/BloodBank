package com.example.bloodbank.error

import java.io.IOException

class BloodBankException(private val responseCode: Int,
                         private val ErrorMessage: String): IOException()
