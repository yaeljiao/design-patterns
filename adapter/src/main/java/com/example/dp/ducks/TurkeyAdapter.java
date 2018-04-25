package com.example.dp.ducks;

/**
 * 将火鸡伪装成为鸭子
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /**
     * 伪装成鸭子的叫法
     */
    @Override
    public void quack() {
        turkey.gobble();
    }

    /**
     * 鸭子比火鸡飞得远，所以让火鸡多飞几次
     */
    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }

    }
}
