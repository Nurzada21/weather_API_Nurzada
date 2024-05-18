package com.example.weather.remote_data;

import com.example.weather.models.Model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("/data/2.5/weather")
    Call<Model> getCurrentWeather(
            @Query("q") String name,
            @Query("appid") String key);

    String URL = "d6e08106c30d433fb68792e976bfdf5c";

}
