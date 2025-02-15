package com.wipro.java.designpattern.adapter;
/**
 * Adapter class that converts stock data from XML format to JSON format.
 */
public class StockDataAdapter {
    private StockData stockData;
    /**
     * Constructor initializes the adapter with an XML data source.
     * @param stockData - The XML stock data source.
     */
    public StockDataAdapter(StockData stockData) {
        this.stockData = stockData;
    }
    /**
     * Converts stock data from XML format to JSON format using string replacement.
     * @return JSON formatted stock data.
     */
    public String getStockDataAsJSON() {
    	// Fetch stock data in XML format
        String xmlData = stockData.getStockData();
     // Simulating XML to JSON conversion manually (basic string replacement)
        String jsonData = xmlData
                .replace("<stocks>", "{ \"stocks\": ")
                .replace("</stocks>", " }")
                .replace("<stock>", "{ \"stock\": ")
                .replace("</stock>", " }")
                .replace("<name>", "\"name\": \"")
                .replace("</name>", "\", ")
                .replace("<price>", "\"price\": ")
                .replace("</price>", "");

        return jsonData;
    }
}

