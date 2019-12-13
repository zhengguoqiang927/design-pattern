package com.zhengguoqiang.singleton;

/**
 * @author zhengguoqiang
 */
public class SingletonDoubleCheck {

    private SingletonDoubleCheck() {
    }

    /**
     * volatile必须要有，否则线程不安全
     * 主要用到其 '禁止指令重排序' 功能
     */
    private static volatile SingletonDoubleCheck instance;


    /*
     * 创建对象三步曲：
     * 1. amalloc分配内存空间
     * 2. 创建对象
     * 3. instance指向内存地址
     *
     * 其中第二步和第三部可以进行指令重排序
     * 导致外部线程判断 instance == null 为false，而此时实例并没有真正创建，只是指向了内存地址
     * 这时外部线程拿到的instance并不可用
     *
     */
    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
