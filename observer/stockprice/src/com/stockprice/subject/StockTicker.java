package com.stockprice.subject;

import com.stockprice.observer.StockObserver;

public interface StockTicker {
    void registerObserver(StockObserver observer);
    void removeObserver(StockObserver observer);
    void notifyObservers();
}
