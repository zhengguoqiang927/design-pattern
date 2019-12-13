package com.zhengguoqiang.singleton;

/**
 * @author zhengguoqiang
 */
public class SingletonLazy {
    public static void main(String[] args) {
        SingletonTest2 singletonTest2 = SingletonTest2.getInstance2();
        SingletonTest2 singletonTest3 = SingletonTest2.getInstance2();
        System.out.println(singletonTest2.hashCode());
        System.out.println(singletonTest3.hashCode());
        System.out.println(singletonTest2 == singletonTest3);
    }

    static class SingletonTest2{
        private SingletonTest2(){}

        private static SingletonTest2 instance;

        //优点：懒加载，用到的时候在加载，避免造成空间浪费
        //缺点：线程不安全，多线程环境会产生多个实例
        public static SingletonTest2 getInstance(){
            if (instance == null){
                instance = new SingletonTest2();
            }
            return instance;
        }


        //多线程环境效率低，而且实例只需要实例化一次，之后每次直接获取直接return就行
        //不需要每次获取实例也要排队阻塞
        public static synchronized  SingletonTest2 getInstance2(){
            if (instance == null){
                instance = new SingletonTest2();
            }
            return instance;
        }
    }
}
