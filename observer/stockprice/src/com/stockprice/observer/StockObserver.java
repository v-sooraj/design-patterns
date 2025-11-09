package com.stockprice.observer;

import java.util.Map;

public interface StockObserver {
    void update(Map<String, Double> stockPrices);
}
