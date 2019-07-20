package com.zhengguoqiang.decorator.decorators;

import com.zhengguoqiang.decorator.Beverage;
import com.zhengguoqiang.decorator.CondimentDecorator;

/**
 * @author zhengguoqiang
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }

    public double cost() {
        return 0.15 * beverage.getSize() + beverage.cost();
    }
}
