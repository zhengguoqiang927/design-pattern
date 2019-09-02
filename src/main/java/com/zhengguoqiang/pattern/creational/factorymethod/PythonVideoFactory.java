package com.zhengguoqiang.pattern.creational.factorymethod;

/**
 * @author zhengguoqiang
 */
public class PythonVideoFactory extends VideoFactory {
    Video getVideo() {
        return new PythonVideo();
    }
}
