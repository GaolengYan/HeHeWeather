package com.garry.heheweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 颜伟凡 on 2017/5/28.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
