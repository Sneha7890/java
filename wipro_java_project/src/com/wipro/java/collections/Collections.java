package com.wipro.java.collections;
/*
 * ArrayList
 * HashMap
 * LinkedList
 */
import java.util.*;

public class Collections {

    // ArrayList to store a list of integers
    private ArrayList<Integer> arrayList;
    
    // HashMap to store key-value pairs
    private HashMap<Integer, String> hashMap;
    
    // LinkedList to store strings with fast insertions/removals
    private LinkedList<String> linkedList;

    // Constructor to initialize collections
    public Collections() {
        arrayList = new ArrayList<>();
        hashMap = new HashMap<>();
        linkedList = new LinkedList<>();
    }

    // Method to add elements to the collections
    public void addElements() {
        // Adding elements to ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        
        // Adding elements to HashMap
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        
        // Adding elements to LinkedList
        linkedList.add("Cat");
        linkedList.add("Dog");
        linkedList.add("Fish");
    }

    // Demonstrating operations like put, get, remove, and set on HashMap, ArrayList, and LinkedList
    public void performOperations() {
        // HashMap - put, get, remove
        System.out.println("Before put operation: " + hashMap);
        hashMap.put(4, "Four"); // put: Adds key-value pair to the map
        System.out.println("After put operation: " + hashMap);

        String value = hashMap.get(2); // get: Retrieves value by key
        System.out.println("Get value for key 2: " + value);

        hashMap.remove(1); // remove: Removes entry by key
        System.out.println("After remove operation: " + hashMap);

        // ArrayList - set
        System.out.println("Before set operation: " + arrayList);
        arrayList.set(1, 25); // set: Replaces element at index 1 with 25
        System.out.println("After set operation: " + arrayList);

        // LinkedList - add, remove, get, set
        System.out.println("Before LinkedList operations: " + linkedList);

        // add: Adding elements to LinkedList
        linkedList.addFirst("Elephant"); // Adds to the beginning
        linkedList.addLast("Giraffe");   // Adds to the end
        System.out.println("After adding Elephant and Giraffe: " + linkedList);

        // remove: Removing elements from LinkedList
        linkedList.remove("Dog"); // Removes "Dog" from the list
        linkedList.removeFirst(); // Removes the first element
        linkedList.removeLast();  // Removes the last element
        System.out.println("After remove operations: " + linkedList);

        // get: Get element at index
        String firstElement = linkedList.get(0); // Get element at index 0
        System.out.println("Element at index 0: " + firstElement);

        // set: Update element at index
        linkedList.set(0, "Horse"); // Update the first element to "Horse"
        System.out.println("After set operation: " + linkedList);
    }

    // Method to print all the collections
    public void printCollections() {
        System.out.println("ArrayList: " + arrayList);
        System.out.println("HashMap: " + hashMap);
        System.out.println("LinkedList: " + linkedList);
    }

    public static void main(String[] args) {
        // Create an instance of the Collections class
        Collections example = new Collections();
        
        // Add elements to collections
        example.addElements();
        
        // Perform operations on collections
        example.performOperations();
        
        // Print collections
        example.printCollections();
    }
}
