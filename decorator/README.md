# 装饰者模式



## 需求

设计一个咖啡订单系统，有几种饮料(Beverage)可供选择，如黑咖啡（House Blend），焦炒咖啡(dark roast)，浓咖啡（espresso）等等，同时每种饮料可以加一些调料(Condiment)，如牛奶，豆浆(Soy)，摩卡(Mocha)等等。

订单系统要求根据加入的调料收取不同的费用，并且打印出的订单上要有饮料加调料的名字。



---

## 实现



不好的设计方式：将所有调料的放在Beverage类中作为成员变量，并通过cost()方法得到饮料的总价钱。

```java
public class Beverage {
    private static final float MILK_COST = 1.1f;
    private static final float SOY_COST = 1.2f;
    private static final float MOCHA_COST = 1.3f;

    private boolean milk;
    private boolean soy;
    private boolean mocha;

    public Beverage(boolean milk, boolean soy, boolean mocha) {
        this.milk = milk;
        this.soy = soy;
        this.mocha = mocha;
    }

    public boolean hasMilk() { return milk; }

    public boolean hasSoy() { return soy; }

    public boolean hasMocha() { return mocha; }

    public double cost() {
        float condimentCost = 0.0f;
        if (hasMilk()) {
            condimentCost += MILK_COST;
        }
        if (hasSoy()) {
            condimentCost += SOY_COST;
        }
        if (hasMocha()) {
            condimentCost += MOCHA_COST;
        }
        return condimentCost;
    }
}
```

再通过具体的饮料类获得饮料加调料的价格

```java
public class DarkRoast extends Beverage {
    private static final float DARK_ROAST_COST = 1.99f;

    /**
     * 判断该订单中加入了哪些调料
     */
    public DarkRoast(boolean hasMilk, boolean hasSoy, boolean hasMocha) {
        super(hasMilk, hasSoy, hasMocha);
    }

    @Override
    public double cost() {
        return DARK_ROAST_COST + super.cost();
    }
}
```

该设计的缺点：

1. 如果要新增加调料，需要对Beverage类进行修改，增加新的成员变量和方法，并且要修改cost()方法
2. 对于某些饮料而言，加入某些调料是不合适的，比如在冰茶中加入牛奶，该设计会导致这种问题
3. 如果顾客要双倍摩卡的咖啡，该设计不能处理这种需求

> 设计原则：类应该对扩展开放，对修改关闭





**装饰者模式**：动态地将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案。



装饰者和被装饰者必须是一样的类型，也就是具有共同的超类。

疑问：装饰者（Condiment类）需要继承自被装饰者类（Beverage类），是否违背了设计原则：多用组合，少用继承。

解答：装饰者的继承不是为了继承某种行为，而是用继承来达到“类型匹配”的效果，因此和**多用组合，少用继承**是不矛盾的


