package com.zhengguoqiang.strategy;

import com.zhengguoqiang.strategy.behavior.FlyWithWings;
import com.zhengguoqiang.strategy.behavior.Quack;

/**
 * @author zhengguoqiang
 */
public class MallardDuck extends Duck{

    public MallardDuck(String name) {
        this.name = name;
        this.flyable = new FlyWithWings();
        this.quackable = new Quack();
    }

    @Override
    void display() {
        System.out.println(name + " 外观是绿头");
    }

}
