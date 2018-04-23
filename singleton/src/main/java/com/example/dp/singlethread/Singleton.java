package com.example.dp.singlethread;

/**
 * 在多线程环境下会导致创建多个实例
 * @author H155719
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
