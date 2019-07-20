package com.zhengguoqiang.decorator.decorators;

import com.zhengguoqiang.decorator.Beverage;
import com.zhengguoqiang.decorator.CondimentDecorator;

/**
 * @author zhengguoqiang
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    public double cost() {
        return 0.10 * beverage.getSize() + beverage.cost();
    }
}
