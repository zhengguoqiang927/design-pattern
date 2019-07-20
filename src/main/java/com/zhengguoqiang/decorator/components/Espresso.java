package com.zhengguoqiang.decorator.components;

import com.zhengguoqiang.decorator.Beverage;

/**
 * 浓缩咖啡 具体组件类
 *
 * @author zhengguoqiang
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
