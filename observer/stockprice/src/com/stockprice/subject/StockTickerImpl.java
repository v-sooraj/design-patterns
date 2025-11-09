package com.stockprice.subject;

import com.stockprice.observer.StockObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockTickerImpl implements StockTicker {

    private final List<StockObserver> observers;
    private final Map<String, Double> stockPrices = new HashMap<>();

    public StockTickerImpl() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(StockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(stockPrices);
        }
    }

    private void stockPriceChanged(String stockSymbol, double stockPrice) {
        Double oldPrice = stockPrices.get(stockSymbol);

        // Only notify if price actually changed (or it's a new symbol)
        if (oldPrice == null || Double.compare(oldPrice, stockPrice) != 0) {
            stockPrices.put(stockSymbol, stockPrice);
            notifyObservers();
        }
    }

    public void setStockPrice(String stockSymbol, double stockPrice) {
        stockPriceChanged(stockSymbol, stockPrice);
    }
}
