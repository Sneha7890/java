package com.wipro.java.designpattern.adapter;
/**
 * A concrete implementation of StockData that provides stock data in XML format.
 */
public class XMLStockData implements StockData {
    @Override
    public String getStockData() {
    	// Simulating stock data in XML format
        return "<stocks><stock><name>Apple</name><price>150</price></stock></stocks>";
    }
}
