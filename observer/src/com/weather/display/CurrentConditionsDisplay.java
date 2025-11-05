package com.weather.display;

import com.weather.observer.Observer;
import com.weather.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElements {

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(WeatherData weatherData) {
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
        System.out.println("Current conditions: " + temperature + "°C and " + humidity + "% humidity");
    }
}
