package cn.itcast.weatherapp.gson;

/*总实例类引用创建的各个实体类（5个）*/

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;    //由于daily_forecast中包含的是一个数组，故使用List集合来引用Forecast类
}
