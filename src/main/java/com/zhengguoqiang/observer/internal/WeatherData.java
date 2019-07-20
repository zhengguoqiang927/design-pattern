package com.zhengguoqiang.observer.internal;

import java.util.Observable;

/**
 * Java内置的观察者模式
 *
 * @author zhengguoqiang
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void messurementChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMessurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        messurementChanged();
    }
}
