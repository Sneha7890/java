package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class MainAnimal1 {
	public static void main(String[] args) {
        // Create an ArrayList of Animal objects
        ArrayList<Animal1> animals = new ArrayList<>();
        animals.add(new Animal1("Cat", 5));
        animals.add(new Animal1("buffalo", 10));
        animals.add(new Animal1("dog", 3));
        animals.add(new Animal1("horse", 4));

        // Sorting animals by name using compareTo method
        Collections.sort(animals);

        // Print sorted list
        System.out.println("Animals after sorting by name:");
        for (Animal1 animal : animals) {
            System.out.println(animal.getName() + " - Age: " + animal.getAge());
        }
    }
}
