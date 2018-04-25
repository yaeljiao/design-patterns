package com.example.factorymethod.pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "纽约风格素食比萨饼";
        dough = "特厚的面团";
        sauce = "番茄酱";
        toppings.add("马苏里拉奶酪");
        toppings.add("黑橄榄");
        toppings.add("菠菜");
    }

    @Override
    public void cut() {
        System.out.println("比萨饼切成正方形");
    }
}
