package com.wipro.java.collections.hashmap;
import java.util.HashMap;
/*
 * Demo of how to create a hashmap
 */
public class Hashmap {
  public static void main(String[] args) {

    // create a hashmap
    HashMap<String, Integer> languages = new HashMap<>();

    //put() method is to add elements to hashmap
    languages.put("Java", 8);
    languages.put("JavaScript", 1);
    languages.put("Python", 3);
    System.out.println("HashMap: " + languages);
  }
}