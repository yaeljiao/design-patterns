package com.example.dp.stat;

/**
 * 饿汉模式
 * 缺点：不能延迟加载
 * @author Zhichao
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
