package com.example.android.networkconnect.datafragment.model

import com.google.gson.annotations.SerializedName

data class Value(
    @SerializedName("values")
    val character: Character?
)