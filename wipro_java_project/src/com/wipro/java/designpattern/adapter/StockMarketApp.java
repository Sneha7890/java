package com.wipro.java.designpattern.adapter;
/**
 * Main class demonstrating the Adapter Pattern.
 * It converts XML stock data to JSON format using an adapter and sends it to the analytics library.
 */
public class StockMarketApp {
    public static void main(String[] args) {
        //  Create an instance of XML stock data source
        StockData stockData = new XMLStockData();

        // Use the adapter to convert XML to JSON
        StockDataAdapter adapter = new StockDataAdapter(stockData);

        // JSON-based analytics library that processes stock data
        JSONAnalyticsLibrary analyticsLibrary = new JSONAnalyticsLibrary();

        // Convert XML stock data to JSON and pass it to the analytics library
        String jsonStockData = adapter.getStockDataAsJSON();
        analyticsLibrary.analyzeStockData(jsonStockData);
    }
}
