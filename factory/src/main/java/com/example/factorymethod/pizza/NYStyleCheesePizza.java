package com.example.factorymethod.pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "纽约风格芝士披萨";
        dough = "特厚的面团";
        sauce = "番茄酱";
        toppings.add("马苏里拉奶酪");
    }

    @Override
    public void cut() {
        System.out.println("比萨饼切成正方形");
    }
}
