package com.example.oberser.customize;

/**
 * @author H155719
 */
public class CurrentConditionDisplay implements Observer, Display {
    private WeatherData weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
