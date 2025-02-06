package com.wipro.java.collections;
/*
 * Using Comparable
 * Creating Animal1
 */
public class Animal1 implements Comparable<Animal1> {
    private String name;
    private int age;

    
    // Implementing compareTo method for sorting animals by name
    @Override
    public int compareTo(Animal1 a) {
        return this.name.compareTo(a.name);  // Sorting by name in ascending order
    }

    // Constructor
    public Animal1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}