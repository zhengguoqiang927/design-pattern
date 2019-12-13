package com.zhengguoqiang.singleton;

/**
 * @author zhengguoqiang
 */
public class TestMain {
    public static void main(String[] args) {
        /*SingletonDoubleCheck instance = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck instance2 = SingletonDoubleCheck.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance == instance2);*/

        SingletonClassInit instance = SingletonClassInit.getInstance();
        SingletonClassInit instance2 = SingletonClassInit.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance == instance2);
    }
}
