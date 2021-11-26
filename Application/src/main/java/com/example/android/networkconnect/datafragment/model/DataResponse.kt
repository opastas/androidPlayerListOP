package com.example.android.networkconnect.datafragment.model

import com.google.gson.annotations.SerializedName

// Class to retrieve response from retrofit call to host
data class DataResponse(
    @SerializedName("values")
    val values: List<Character>?
)