package com.wipro.java.collections.treemap.usecase;
import java.util.*;
/*
 * 
 */
public class TreeToHashMap {

	
	    public static void main(String[] args) {
	        // Step 1: Create and populate a TreeMap
	        // TreeMap is a map that stores the data in sorted order based on its keys.
	        TreeMap<Integer, String> treeMap = new TreeMap<>();

	        // Adding key-value pairs to the TreeMap
	        treeMap.put(1, "One");    // Key 1 maps to "One"
	        treeMap.put(2, "Two");    // Key 2 maps to "Two"
	        treeMap.put(3, "Three");  // Key 3 maps to "Three"
	        treeMap.put(4, "Four");   // Key 4 maps to "Four"

	        // Step 2: Display TreeMap content
	        // Since TreeMap stores entries in sorted order, the keys will be sorted automatically.
	        System.out.println("TreeMap content: " + treeMap);  // Output will be sorted by the keys

	        // Step 3: Create a HashMap
	        // HashMap does not maintain any order of its entries. It stores them based on hash values.
	        HashMap<Integer, String> hashMap = new HashMap<>();

	        // Step 4: Transfer data from TreeMap to HashMap
	        // The `putAll()` method is used to copy all the key-value pairs from the TreeMap to the HashMap.
	        hashMap.putAll(treeMap);  // Copies all entries from TreeMap to HashMap

	        // Step 5: Display HashMap content
	        // The HashMap does not guarantee any specific order of its entries, so the order might be different.
	        System.out.println("HashMap content: " + hashMap);  // Output might be in any order
	    }
}



