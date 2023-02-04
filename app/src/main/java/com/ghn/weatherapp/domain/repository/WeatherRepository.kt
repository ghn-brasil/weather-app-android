package com.ghn.weatherapp.domain.repository

import com.ghn.weatherapp.data.remote.dto.RealTimeDto
import com.ghn.weatherapp.domain.util.Resource

interface WeatherRepository {

    suspend fun getRealTimeWeather(location: String) : Resource<RealTimeDto>

}