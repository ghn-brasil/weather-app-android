package com.ghn.weatherapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ghn.weatherapp.data.remote.WeatherApi
import com.ghn.weatherapp.data.repository.WeatherRepositoryImpl
import com.ghn.weatherapp.domain.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val repository: WeatherRepository
): ViewModel() {

    fun getRealTimeWeatherData() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getRealTimeWeather("Calgary")
        }
    }
}