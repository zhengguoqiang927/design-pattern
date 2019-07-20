package com.zhengguoqiang.strategy;

import com.zhengguoqiang.strategy.behavior.FlyNoWay;
import com.zhengguoqiang.strategy.behavior.MuteQuack;

/**
 * 橡皮鸭
 * @author zhengguoqiang
 */
public class RubberDuck extends Duck{

    public RubberDuck(String name) {
        this.name = name;
        this.flyable = new FlyNoWay();
        this.quackable = new MuteQuack();
    }

    @Override
    void display() {
        System.out.println(name + " 外观是红头");
    }
}
