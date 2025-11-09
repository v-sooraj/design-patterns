package com.weather.observer;

public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
