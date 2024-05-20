package com.example.weather.remote_data;

import com.example.weather.models.Model;
import com.example.weather.models.WeatherModel;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("/data/2.5/weather")
    Call<Model> getCurrentWeather(
            @Query("q") String name,
            @Query("appid") String key);

    @GET("/data/2.5/weather?&appid=ec7a1f27ebd46292673a70363e180640")
    Call<WeatherModel> getWeather(
            @Query("q") String name);

    String url="ec7a1f27ebd46292673a70363e180640";
}
