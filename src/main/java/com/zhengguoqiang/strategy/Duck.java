package com.zhengguoqiang.strategy;

import com.zhengguoqiang.strategy.behavior.Flyable;
import com.zhengguoqiang.strategy.behavior.Quackable;

/**
 * 策略模式基类
 *
 * @author zhengguoqiang
 */
public abstract class Duck {

    String name;
    Flyable flyable;
    Quackable quackable;

    /**
     * 子类实现完全相同，所以抽象到父类中
     */
    void swim() {
        System.out.println("all ducks can swimming!");
    }

    /**
     * 子类中部分一样，部分不一样
     *
     * 部分一样就表示这些子类可以复用共同的fly
     */
    void performFly() {
        System.out.println(name + " say:" + flyable.fly());
    }

    void performQuack() {
        System.out.println(name + " say:" + quackable.quack());
    }

    /**
     * 子类实现完全不同，所以放到子类实现，即便以后变化，由于子类完全不同可单独修改子类
     *
     * 模版方法模式
     */
    abstract void display();

    /**
     * 运行过程中动态设定行为
     *
     * @param flyable
     */
    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }
}
