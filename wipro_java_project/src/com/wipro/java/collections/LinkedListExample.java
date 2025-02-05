package com.wipro.java.collections;
/*
 * LinkedList
 */
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        int n = 10; 
        LinkedList<Integer> ll = new LinkedList<>(); // Creating LinkedList

        // Adding elements to the LinkedList
        for (int i = 1; i <= n; i++) {
            ll.add(i);
        }

        // Printing elements
        System.out.println("Original LinkedList: " + ll);

        // Remove element at index 3 (0-based index)
        ll.remove(3);

        // Displaying the list after deletion
        System.out.println("LinkedList after removal at index 3: " + ll);

        // Printing elements one by one
        System.out.print("Elements in LinkedList: ");
        for (int i = 0; i < ll.size(); i++) {
        	
            System.out.print(ll.get(i) + " ");
        }
    }
}
