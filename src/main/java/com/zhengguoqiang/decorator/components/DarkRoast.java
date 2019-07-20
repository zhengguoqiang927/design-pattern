package com.zhengguoqiang.decorator.components;

import com.zhengguoqiang.decorator.Beverage;

/**
 * @author zhengguoqiang
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "DarkRoast";
    }

    public double cost() {
        return 0.99;
    }
}
