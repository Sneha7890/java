package com.wipro.java.collections.hashmap;
import java.util.HashMap;
/*
 * Demo for Remove hashmap Elemnents
 */

public class RemoveHashMapElements {
	  public static void main(String[] args) {

	    HashMap<Integer, String> languages = new HashMap<>();
	    languages.put(1, "Java");
	    languages.put(2, "Python");
	    languages.put(3, "JavaScript");
	    System.out.println("HashMap: " + languages);

	    // remove element associated with key 2
	    String value = languages.remove(2);
	    System.out.println("Removed value: " + value);

	    System.out.println("Updated HashMap: " + languages);
	  }
}
