package com.garry.heheweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 颜伟凡 on 2017/5/28.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
