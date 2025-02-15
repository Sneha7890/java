package com.wipro.java.designpattern.adapter;
/**
 * A third-party analytics library that only accepts JSON data for analysis.
 */
public class JSONAnalyticsLibrary {
	
	/**
     * Method to analyze stock data in JSON format.
     * @param jsonStockData - Stock data converted to JSON format.
     */
    public void analyzeStockData(String jsonStockData) {
        System.out.println("Analyzing stock data in JSON format: " + jsonStockData);
    }
}

