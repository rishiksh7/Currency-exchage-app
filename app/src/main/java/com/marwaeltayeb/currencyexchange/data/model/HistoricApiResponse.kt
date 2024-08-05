package com.marwaeltayeb.currencyexchange.data.model

import com.google.gson.annotations.SerializedName

data class HistoricApiResponse(
    @SerializedName("base")
    val base: String,
    @SerializedName("end_date")
    val endAt: String,
    @SerializedName("rates")
    val rates: Map<String, Map<String, Double>>,
    @SerializedName("start_date")
    val startAt: String
)
