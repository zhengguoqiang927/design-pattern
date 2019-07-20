package com.zhengguoqiang.strategy;

import com.zhengguoqiang.strategy.behavior.FlyWithWings;
import com.zhengguoqiang.strategy.behavior.Squeak;

/**
 * @author zhengguoqiang
 */
public class RedheadDuck extends Duck {

    public RedheadDuck(String name) {
        this.name = name;
        this.flyable = new FlyWithWings();
        this.quackable = new Squeak();
    }

    @Override
    void display() {
        System.out.println(name + " 外观是红头");
    }
}
