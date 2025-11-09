package com.weather.display;

import com.weather.observer.Observer;

public class StatisticsDisplay implements Observer, DisplayElements {

    private float maxTemp = Float.MIN_VALUE;
    private float minTemp = Float.MAX_VALUE;
    private float tempSum = 0.0f;
    private int numReadings = 0;

    public StatisticsDisplay(com.weather.subject.WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings++;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        display();
    }

    @Override
    public void display() {
        float avgTemp = tempSum / numReadings;
        System.out.println("Avg/Max/Min temperature: " + avgTemp + "/" + maxTemp + "/" + minTemp);
    }
}
