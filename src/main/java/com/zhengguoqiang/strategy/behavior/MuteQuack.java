package com.zhengguoqiang.strategy.behavior;

/**
 * @author zhengguoqiang
 */
public class MuteQuack implements Quackable {
    public String quack() {
        return "<< Silence >>";
    }
}
