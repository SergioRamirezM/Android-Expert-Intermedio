package com.papelmark.horoscapp.domain

import com.papelmark.horoscapp.data.network.response.PredictionResponse
import com.papelmark.horoscapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign: String) : PredictionModel?
}