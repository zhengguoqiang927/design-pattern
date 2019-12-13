package com.zhengguoqiang.singleton;

/**
 * @author zhengguoqiang
 */
public class SingletonClassInit {

    private SingletonClassInit() {
    }

    /**
     * 前提：外部类SingletonClassInit的加载和初始化并不影响内部类的加载和初始化
     *
     * 只有在调用getInstance方法时才会触发静态内部类SingletonHolder的加载
     * 而类在加载完成后进行初始化的时候，jvm会进行加锁，保证多线程环境下只有一个线程去执行初始化操作
     *
     */
    private static class SingletonHolder {
        private static final SingletonClassInit instance = new SingletonClassInit();
    }

    public static SingletonClassInit getInstance() {
        return SingletonHolder.instance;
    }

}
