package com.zhengguoqiang.observer;

/**
 * @author zhengguoqiang
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMessurements(80,65,30.4f);
        weatherData.setMessurements(82,70,29.f);
    }
}
