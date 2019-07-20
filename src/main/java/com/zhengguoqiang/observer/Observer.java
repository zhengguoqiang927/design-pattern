package com.zhengguoqiang.observer;

/**
 * @author zhengguoqiang
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
