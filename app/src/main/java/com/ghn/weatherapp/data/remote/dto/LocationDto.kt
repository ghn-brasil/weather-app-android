package com.ghn.weatherapp.data.remote.dto

data class LocationDto(
    val lat: Double,
    val lon: Double,
    val name: String,
    val type: String
)