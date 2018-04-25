package com.example.simplefactory;

import com.example.simplefactory.pizza.CheesePizza;
import com.example.simplefactory.pizza.GreekPizza;
import com.example.simplefactory.pizza.Pizza;

public class PizzaStoreWithWrongDesign {
    Pizza orderPizza(String pizzaType) {
        Pizza pizza = new Pizza();

        // 创建pizza的代码是变化的部分
        if ("cheese".equals(pizzaType)) {
            pizza = new CheesePizza();
        } else if ("greek".equals(pizzaType)) {
            pizza = new GreekPizza();
        }   // etc.

        // 比萨制作的过程是不变的部分
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
