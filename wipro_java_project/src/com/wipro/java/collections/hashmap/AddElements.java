package com.wipro.java.collections.hashmap;
import java.util.HashMap;
/*
 * Demo of how to add elements in hashmap using put()
 */
public class AddElements {
	  public static void main(String[] args) {

	    // create a hashmap
	    HashMap<String, Integer> numbers = new HashMap<>();

	    System.out.println("Initial HashMap: " + numbers);
	    // put() method to add elements
	    numbers.put("One", 1);
	    numbers.put("Two", 2);
	    numbers.put("Three", 3);
	    System.out.println("HashMap after put(): " + numbers);
	  }
}
