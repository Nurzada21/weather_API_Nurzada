package com.example.weather.remote_data;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder {
    private RetrofitBuilder(){

    }
    private static WeatherApi instance;
    public static WeatherApi getInstance(){
        if (instance == null)

        {
            instance = initIntance();

        }
        return instance;
    }
    private static WeatherApi initIntance()
    {
        return new Retrofit
                .Builder()
                .baseUrl("https://api.openweathermap.org")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(WeatherApi.class);


    }
}
