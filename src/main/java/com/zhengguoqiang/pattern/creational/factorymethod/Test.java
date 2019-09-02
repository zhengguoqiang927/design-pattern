package com.zhengguoqiang.pattern.creational.factorymethod;

/**
 * @author zhengguoqiang
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory1 = new JavaVideoFactory();
        Video video1 = videoFactory1.getVideo();
        video1.produce();

        VideoFactory videoFactory2 = new PythonVideoFactory();
        Video video2 = videoFactory2.getVideo();
        video2.produce();
    }
}
