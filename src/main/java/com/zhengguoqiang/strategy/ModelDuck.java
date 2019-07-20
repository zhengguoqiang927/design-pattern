package com.zhengguoqiang.strategy;

import com.zhengguoqiang.strategy.behavior.FlyNoWay;
import com.zhengguoqiang.strategy.behavior.Quack;

/**
 * @author zhengguoqiang
 */
public class ModelDuck extends Duck {

    public ModelDuck(String name) {
        this.name = name;
        this.flyable = new FlyNoWay();
        this.quackable = new Quack();
    }

    void display() {
        System.out.println("I'm a model duck");
    }
}
