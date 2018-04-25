package com.example.factorymethod.pizza;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    public void prepare() {
        System.out.println("正在准备 " + name);
        System.out.println("揉面团...");
        System.out.println("增加酱料...");
        System.out.println("增加配料: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    public void bake() {
        System.out.println("烘烤25分钟");
    }

    public void cut() {
        System.out.println("按照正常切法切比萨饼");
    }

    public void box() {
        System.out.println("把比萨放在原装盒子中");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }

}
