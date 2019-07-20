package com.zhengguoqiang.observer.internal;

/**
 * @author zhengguoqiang
 */
public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.addObserver(new StatisticsDisplay());
        weatherData.setMessurements(80,65,30.4f);
        weatherData.setMessurements(82,70,29.f);
    }
}
