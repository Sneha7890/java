package com.wipro.java.collections;
/*
 * Arraylist
 */
import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        // Creating two ArrayLists
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        // Adding elements to firstList
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println(l1);
        
        // Adding elements to secondList
        l2.add(10);
        l2.add(20);
        l2.add(30);
        System.out.println(l2);
        
        // Adding all elements of secondList to firstList at index 1
        l1.addAll(1, l2);
        
        System.out.println(""+l1);

        // Removing the element at index 1
        l1.remove(1);
        System.out.println(l1);

        // Setting the first element to 5
        l1.set(0, 5);
        System.out.println(l1);

        // Displaying the list
        System.out.println("Updated List: " + l1);
    }
}

