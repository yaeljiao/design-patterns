package com.example.abstractfactory.pizza;

import com.example.abstractfactory.ingredient.cheese.Cheese;
import com.example.abstractfactory.ingredient.clam.Clams;
import com.example.abstractfactory.ingredient.dough.Dough;
import com.example.abstractfactory.ingredient.pepperoni.Pepperoni;
import com.example.abstractfactory.ingredient.sauce.Sauce;
import com.example.abstractfactory.ingredient.veggie.Veggies;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    /**
     * prepare()中准备原材料
     * 需要声明成抽象方法，让子类决定具体需要哪些原料
     */
    public abstract void prepare();

    public void bake() {
        System.out.println("烘烤25分钟");
    }

    public void cut() {
        System.out.println("按照正常切法切比萨饼");
    }

    public void box() {
        System.out.println("把比萨放在原装盒子中");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clam != null) {
            result.append(clam);
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }
        return result.toString();
    }
}
