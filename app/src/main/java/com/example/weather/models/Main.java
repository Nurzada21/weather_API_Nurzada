package com.example.weather.models;

import com.google.gson.annotations.SerializedName;

public class Main {
    @SerializedName("temp")
    private Double temp;


    @SerializedName("name")
    private String name;

    @SerializedName("temp_max")
    private Double temp_max;


    @SerializedName("temp_min")
    private Double temp_min;


    @SerializedName("humidity")
    private int humidity;

    @SerializedName("pressure")
    private int pressure;

    public Double getTemp() {
        return temp;
    }

    public String getName() {
        return name;
    }

    public Double getTemp_max() {
        return temp_max;
    }

    public Double getTemp_min() {
        return temp_min;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public Double getTempMax() {
        return temp_max;
    }

    public Double getTempMin() {
        return temp_min;
    }


}
