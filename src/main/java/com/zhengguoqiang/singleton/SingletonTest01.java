package com.zhengguoqiang.singleton;

/**
 * @author zhengguoqiang
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        SingletonTest1 singletonTest1 = SingletonTest1.getInstance();
        SingletonTest1 singletonTest2 = SingletonTest1.getInstance();
        System.out.println(singletonTest1.hashCode());
        System.out.println(singletonTest2.hashCode());
        System.out.println(singletonTest1 == singletonTest2);
    }

    static class SingletonTest1{
        //1.构造器私有化，禁止外部类通过构造器创建实例
        private SingletonTest1(){}

        //2.内部创建实例，饿汉式
        //优点：简单方便，线程安全
        //缺点：不是懒加载，可能会造成空间浪费
        private static final SingletonTest1 instance = new SingletonTest1();

        /*static {
            instance = new SingletonTest1();
        }*/

        public static SingletonTest1 getInstance(){
            return instance;
        }
    }
}
