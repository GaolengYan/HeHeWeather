package com.garry.heheweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 颜伟凡 on 2017/5/27.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int weatherCode;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(int weatherCode) {
        this.weatherCode = weatherCode;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
