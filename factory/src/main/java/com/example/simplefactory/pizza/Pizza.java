package com.example.simplefactory.pizza;

public class Pizza {

    public void prepare() {
        System.out.println("正在准备比萨");
        System.out.println("揉面团...");
        System.out.println("增加酱料...");
        System.out.println("增加配料: ");
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

}
