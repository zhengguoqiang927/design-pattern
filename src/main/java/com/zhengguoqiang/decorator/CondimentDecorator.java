package com.zhengguoqiang.decorator;

/**
 * @author zhengguoqiang
 */
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();
}
