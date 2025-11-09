package com.stockprice.component;

import com.stockprice.observer.StockObserver;
import com.stockprice.subject.StockTickerImpl;

public class WebDashboard extends ClientComponent implements StockObserver {

    public WebDashboard(StockTickerImpl stockTicker) {
        stockTicker.registerObserver(this);

    }

    @Override
    public void display() {
        System.out.println("Web Dashboard - Stock: " + stockSymbol + ", Price: " + stockPrice);
    }
}
