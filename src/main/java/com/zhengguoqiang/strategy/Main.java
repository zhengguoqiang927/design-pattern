package com.zhengguoqiang.strategy;

import com.zhengguoqiang.strategy.behavior.FlyRocketPowered;

/**
 * @author zhengguoqiang
 */
public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck("Mallard");
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck("Model");
        model.performFly();
        model.setFlyable(new FlyRocketPowered());
        model.performFly();
    }
}
