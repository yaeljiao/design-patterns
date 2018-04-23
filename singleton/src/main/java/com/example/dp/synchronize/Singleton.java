package com.example.dp.synchronize;

/**
 * 在getInstance()方法上加synchronized
 * 缺点：只有在一次调用getInstance()方法的时候才需要同步，因此其他情况下的同步都是多余的
 * @author Zhichao
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
