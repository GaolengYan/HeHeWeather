package com.garry.heheweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 颜伟凡 on 2017/5/28.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
