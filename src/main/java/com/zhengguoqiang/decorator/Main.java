package com.zhengguoqiang.decorator;

import com.zhengguoqiang.decorator.components.DarkRoast;
import com.zhengguoqiang.decorator.components.Espresso;
import com.zhengguoqiang.decorator.components.HouseBlend;
import com.zhengguoqiang.decorator.decorators.Mocha;
import com.zhengguoqiang.decorator.decorators.Soy;
import com.zhengguoqiang.decorator.decorators.Whip;

/**
 * @author zhengguoqiang
 */
public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1.setSize(Beverage.VENTI);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2.setSize(Beverage.GRANDE);
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
