package com.zhengguoqiang.observer;

/**
 * @author zhengguoqiang
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
