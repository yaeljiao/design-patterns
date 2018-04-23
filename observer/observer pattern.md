# observer method 观察者模式



## 需求

现有一个WeatherData对象，负责追踪目前的天气状况（温度、湿度、气压），现需要设计一个应用，有三种布告板，分别显示目前天气状况、气象统计信息和天气预报。当WeatherData对象获得最新的天气信息时，这三个布告板需要实时更新。

另：该应用需要可扩展，开发者可以根据自己的需求制定新的布告板。



---

## 实现

### 错误的设计：针对实现编程

```java
public class WeatherData {
    // 针对具体实现编程
    private CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
    private StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
    private ForecastDisplay forecastDisplay = new ForecastDisplay();

    private float getTemperature() {
        // 省略
    }

    private float getHumidity() {
        // 省略
    }

    private float getPressure() {
        // 省略
    }

    public void measurementChange() {
        float temperature = getTemperature();
        float humididy = getHumidity();
        float pressure = getPressure();

        // 针对具体实现编程，导致后期增加或删除布告板时，必须再修改代码
        currentConditionsDisplay.update(temperature, humididy, pressure);
        statisticsDisplay.update(temperature, humididy, pressure);
        forecastDisplay.update(temperature, humididy, pressure);
    }
}
```

> 设计原则：针对接口编程，而不是针对实现编程



---

### 观察者模式

观察者模式：在对象之间定义**一对多的依赖**，当被观察的对象（主题）改变状态，依赖它的对象（观察者）都会收到通知，并自动更新。比如订阅报纸，一旦有新的报纸，出版社就会送新的报纸给订阅者。

> 设计原则：为了交互对象之间的松耦合设计而努力（松耦合即两个对象可以进行交互，但是不清楚彼此的具体细节）

观察者模式让主题和观察者之间松耦合，主题只知道观察者实现了Oberser接口，但不需要知道观察者的实现类是谁或其他细节。





---

### JDK自带的观察者模式

java.util.Observable的缺点

1. Observable是一个类，意味着被观察者不能够继承其他的类，这样降低了Observable的复用能力。

> 设计原则：针对接口编程，而不是针对实现编程



2. Observable的`setChanged()`方法是protected，意味着我们不能创建一个Observable实例并组合到自己的对象中。

> 设计原则：多用组合，少用继承























