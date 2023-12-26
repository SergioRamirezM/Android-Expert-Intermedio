package com.papelmark.horoscapp.data

import android.util.Log
import com.papelmark.horoscapp.data.network.HoroscopeApiService
import com.papelmark.horoscapp.domain.Repository
import com.papelmark.horoscapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String) : PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("TAG-303", "No ha funcionado perro hijueputa ${it.message}") }
        return null
    }
}