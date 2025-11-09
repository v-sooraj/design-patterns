package com.stockprice.component;

import java.util.Map;

public abstract class ClientComponent {

    protected String stockSymbol;
    protected double stockPrice;

    public abstract void display();

    public void update(Map<String, Double> stockPrices) {
        for (Map.Entry<String, Double> entry : stockPrices.entrySet()) {
            this.stockSymbol = entry.getKey();
            this.stockPrice = entry.getValue();
            display();
        }
    }
}
