package com.ghn.weatherapp.data.repository

import com.ghn.weatherapp.data.remote.WeatherApi
import com.ghn.weatherapp.data.remote.dto.RealTimeDto
import com.ghn.weatherapp.domain.repository.WeatherRepository
import com.ghn.weatherapp.domain.util.Resource
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
) : WeatherRepository {

    override suspend fun getRealTimeWeather(location: String): Resource<RealTimeDto> {
        return try {
            Resource.Success(
                data = api.getCurrentWeather(
                    location = "caieiras"
                )
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }

}