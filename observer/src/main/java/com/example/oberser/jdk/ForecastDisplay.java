package com.example.oberser.jdk;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, Display {
    private Observable observable;
    private float currentPressure = 33.0f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    // TODO: 4/23/2018 如何通过arg获取参数
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getTemperature();
            display();
        }
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
