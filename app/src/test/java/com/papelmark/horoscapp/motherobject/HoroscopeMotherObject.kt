package com.papelmark.horoscapp.motherobject

import com.papelmark.horoscapp.data.network.response.PredictionResponse
import com.papelmark.horoscapp.domain.model.HoroscopeInfo.*

object HoroscopeMotherObject {

    val anyResponse = PredictionResponse("date", "prediction", "taurus")

    val horoscopeInfoList = listOf(
        Aries,
        Taurus,
        Gemini,
        Cancer,
        Leo,
        Virgo,
        Libra,
        Scorpio,
        Sagittarius,
        Capricorn,
        Aquarius,
        Pisces
    )
}