package com.example.android.networkconnect.datafragment.model

import com.google.gson.annotations.SerializedName

data class Character(
        @SerializedName("first_name")
        val first_name: String?,
        @SerializedName("h_in")
        val h_in: String?,
        @SerializedName("h_meters")
        val h_meters: String?,
        @SerializedName("last_name")
        val last_name: String?
)