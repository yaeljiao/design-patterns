# 策略模式



## 需求

现有一款模拟鸭子行为的游戏，鸭子有swim(),quack(),display()行为。现要求为鸭子添加fly()行为，但是要注意某些类型的鸭子不能够飞（比如橡皮鸭子）。



---

## 实现

方法一：使用继承，在父类Duck中实现fly()方法， 这样通过继承以达到让所有子类都能够**复用**fly()行为。

缺点：在父类中实现新的方法，会让不具有新行为的子类也具有了该行为（比如此场景下的橡皮鸭，它并不具备fly()行为）。此时，只能在橡皮鸭中覆盖（@Override）fly()方法来移除该行为。因此，在代码的维护阶段，**通过继承来实现复用只会让代码越来越难以维护**。



方法二：使用接口，将fly()方法放入Flyable接口中，让具有飞行行为的鸭子实现Flyable接口。

缺点：将fly()放在接口中，会导致每一个具有飞行行为的鸭子类需要自己实现fly()方法，导致有很多重复代码，**造成代码无法复用**。

```java
public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    public void fly() {
        System.out.println("i can fly");
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
```



方法三：使用策略模式，定义了算法族，分别封装起来，让它们之间可以相互替换，此模式让算法的变化独立于使用算法的客户。比如人人都要要交‘个人所得税’，但是“在美国交个人所得税”和“在中国交个人所得税”就有不同的算法。



> 设计原则一：把代码中会变化的部分提取并封装起来，以便以后能更好的改动和扩充这一部分，而不影响不需要变化的其他部分。

在本案例中，鸭子类的fly和quack行为会根据不同种类的鸭子而改变，故为变化的部分



> 设计原则二：针对接口编程，而不是针对实现编程。

注：**针对接口编程**不是指Java中的`interface`，而是指**针对超类编程**。核心就是为了使用多态。针对超类编程说的通俗点，就是将变量声明成超类型，通常是接口或者抽象类。

针对接口编程能够让程序变得有弹性，我们可以在运行时改变鸭子的行为



> 设计原则三：多用组合，少用继承

鸭子的行为不是通过继承而得到的，而是通过多个行为对象“组合”而来





