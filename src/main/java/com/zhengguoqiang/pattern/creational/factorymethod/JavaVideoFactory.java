package com.zhengguoqiang.pattern.creational.factorymethod;

/**
 * @author zhengguoqiang
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    Video getVideo() {
        return new JavaVideo();
    }
}
