package com.zhengguoqiang.observer.internal;

import com.zhengguoqiang.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zhengguoqiang
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions:" + temperature +
                " F degrees and " + humidity + "% humidity");
    }
}
