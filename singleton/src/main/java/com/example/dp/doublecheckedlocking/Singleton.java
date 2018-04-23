package com.example.dp.doublecheckedlocking;

/**
 * 使用双重锁检查(double checked locking)
 * @author Zhichao
 */
public class Singleton {
    private static volatile Singleton uniqueInstance;

    private Singleton(){}

    /**
     * @return 单例
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
