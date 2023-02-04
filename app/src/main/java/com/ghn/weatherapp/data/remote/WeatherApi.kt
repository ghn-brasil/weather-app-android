package com.ghn.weatherapp.data.remote

import com.ghn.weatherapp.BuildConfig
import com.ghn.weatherapp.data.remote.dto.RealTimeDto
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface WeatherApi {

    @Headers("apiKey: $API_KEY")
    @GET("realtime?location=caieiras")
    suspend fun getCurrentWeather(
        @Query("location") location: String
    ): RealTimeDto

}

const val API_KEY = BuildConfig.API_KEY