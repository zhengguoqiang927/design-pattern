package com.zhengguoqiang.decorator.decorators;

import com.zhengguoqiang.decorator.Beverage;
import com.zhengguoqiang.decorator.CondimentDecorator;

/**
 * @author zhengguoqiang
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    public double cost() {
        return 0.5 * beverage.getSize() + beverage.cost();
    }
}
