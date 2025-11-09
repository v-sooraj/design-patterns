package com.weather.subject;

import com.weather.observer.Observer;

public interface Subject {

    void registerObserver(Observer o);
    void unregisterObserver(Observer o);
    void notifyObservers();
}
