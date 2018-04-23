package com.example.oberser.customize;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observerList.indexOf(o);
        if (index >= 0) {
            observerList.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        // 被观察者主动推送更新给观察者
        for (Observer observer: observerList) {
            observer.update(temperature, humidity, pressure);
        }
    }

    private void measurementsChange() {
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChange();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
