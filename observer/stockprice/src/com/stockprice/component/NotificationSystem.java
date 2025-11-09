package com.stockprice.component;

import com.stockprice.observer.StockObserver;
import com.stockprice.subject.StockTickerImpl;

public class NotificationSystem extends ClientComponent implements StockObserver {

    public NotificationSystem(StockTickerImpl stockTicker) {
        stockTicker.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Notification System - Stock: " + stockSymbol + ", Price: " + stockPrice);
    }
}
