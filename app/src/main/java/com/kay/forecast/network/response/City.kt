package com.kay.forecast.network.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class City {
    @SerializedName("id")
    @Expose
    var id: Long? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("coord")
    @Expose
    var coordination: Coordination? = null

    @SerializedName("country")
    @Expose
    var country: String? = null

    @SerializedName("population")
    @Expose
    var population: Int? = null

    @SerializedName("timezone")
    @Expose
    var timezone: Int? = null

}