package com.example.factorymethod;

import com.example.factorymethod.pizza.Pizza;

public class Test {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoSotre = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Jack ordered a " + pizza.getName() + "\n");

        Pizza pizza1 = chicagoSotre.orderPizza("cheese");
        System.out.println("Mike ordered a " + pizza1.getName() + "\n");
    }
}
