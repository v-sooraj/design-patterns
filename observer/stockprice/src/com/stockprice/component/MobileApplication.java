package com.stockprice.component;

import com.stockprice.observer.StockObserver;
import com.stockprice.subject.StockTickerImpl;

public class MobileApplication extends ClientComponent implements StockObserver {

    public MobileApplication(StockTickerImpl stockTicker) {
        stockTicker.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Mobile Application - Stock: " + stockSymbol + ", Price: " + stockPrice);
    }
}
