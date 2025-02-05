package com.wipro.java.collections;
/*
 * Hashmap
 */
import java.util.HashMap;
import java.util.Map;

public class MapImplementation {
    public static void main(String[] args) {
        // Create a HashMap
        Map<Integer, String> map = new HashMap<>();

        // Put values into the map
        map.put(136, "Sneha");
        map.put(146, "Swetha");
        map.put(131, "Sowmiya");
        map.put(155, "Yalini");
        map.put(147, "Vizhi");
        map.put(100, "priya");

        // Get a value from the map
        System.out.println("Value for key 146: " + map.get(146));
        System.out.println("Value for key 136: " + map.get(136));

        // Remove an entry from the map
        map.remove(100);
        System.out.println("Map after removing key 100: " + map);

        // Iterate over the entries of the map
        System.out.println("Iterating over map entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

