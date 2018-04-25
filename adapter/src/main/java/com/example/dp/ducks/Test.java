package com.example.dp.ducks;

public class Test {
    public static void main(String[] args) {
        WildTurkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        testDuck(turkeyAdapter);
    }

    /**
     * 测试是否是鸭子的类
     * 为了能够让火鸡通过测试，需要通过适配器模式将火鸡伪装成鸭子
     * @param duck
     */
    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
