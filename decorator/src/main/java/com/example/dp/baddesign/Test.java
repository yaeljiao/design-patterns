package com.example.dp.baddesign;

public class Test {
    public static void main(String[] args) {
        DarkRoast darkRoastWithMilk = new DarkRoast(true, false, false);
        System.out.println("Price is " + darkRoastWithMilk.cost());
    }
}
