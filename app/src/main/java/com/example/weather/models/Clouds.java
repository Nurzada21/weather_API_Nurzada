package com.example.weather.models;

import com.google.gson.annotations.SerializedName;

public class Clouds {
    @SerializedName("all")
    private long all;

    public long getAll() {
        return all;
    }
}
