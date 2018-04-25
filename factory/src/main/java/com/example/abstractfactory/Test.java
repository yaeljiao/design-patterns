package com.example.abstractfactory;

import com.example.abstractfactory.pizza.Pizza;
import com.example.abstractfactory.pizzastore.ChicagoPizzaStore;
import com.example.abstractfactory.pizzastore.NYPizzaStore;
import com.example.abstractfactory.pizzastore.PizzaStore;

public class Test {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

    }
}
