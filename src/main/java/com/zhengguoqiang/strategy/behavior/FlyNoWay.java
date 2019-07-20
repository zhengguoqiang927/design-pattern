package com.zhengguoqiang.strategy.behavior;

import com.zhengguoqiang.strategy.behavior.Flyable;

/**
 * @author zhengguoqiang
 */
public class FlyNoWay implements Flyable {
    public String fly() {
        return "I can't fly";
    }
}
