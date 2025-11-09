package com.stockprice.test;

import com.stockprice.component.MobileApplication;
import com.stockprice.component.NotificationSystem;
import com.stockprice.component.WebDashboard;
import com.stockprice.subject.StockTickerImpl;

public class StockBroker {

    public static void main(String[] args) {
        StockTickerImpl stockTicker = new StockTickerImpl();

        MobileApplication mobileApplication = new MobileApplication(stockTicker);
        WebDashboard webDashboard = new WebDashboard(stockTicker);
        NotificationSystem notificationSystem = new NotificationSystem(stockTicker);

        stockTicker.setStockPrice("AAPL", 150.00);
        stockTicker.setStockPrice("GOOGL", 2800.50);
        stockTicker.setStockPrice("AAPL", 151.01);
        stockTicker.setStockPrice("AMZN", 3400.75);

    }
}
