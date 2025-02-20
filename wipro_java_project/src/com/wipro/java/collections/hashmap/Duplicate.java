package com.wipro.java.collections.hashmap;
import java.util.*;

public class Duplicate {
	    public static void main(String[] args) {
	        // HashMap to store roll numbers as keys and names as values in a list
	        Map<Integer, List<String>> studentMap = new HashMap<>();

	        // Array of student names and roll numbers (with duplicate names and roll numbers)
	        String[][] students = {
	            {"Alice", "101"}, {"Bob", "102"}, {"Charlie", "103"},
	            {"David", "101"}, {"Emma", "104"}, {"Frank", "102"},
	            {"Alice", "101"}, {"Bob", "102"}, {"Charlie", "103"}, {"Emma", "104"}
	        };

	        // Inserting students into the HashMap
	        for (String[] student : students) {
	            String name = student[0];
	            int rollNumber = Integer.parseInt(student[1]);

	            // If roll number exists, add name to the list; otherwise, create a new list
	            studentMap.computeIfAbsent(rollNumber, k -> new ArrayList<>()).add(name);
	        }

	        // Displaying the students
	        System.out.println("Students with duplicate names and roll numbers:");
	        for (Map.Entry<Integer, List<String>> entry : studentMap.entrySet()) {
	            System.out.println("Roll No: " + entry.getKey() + " -> " + entry.getValue());
	        }
	    }
}



