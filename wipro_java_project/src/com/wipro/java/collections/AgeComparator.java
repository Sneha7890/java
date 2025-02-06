package com.wipro.java.collections;
/*
 * AgeComparator implements Animal
 * Creating AgeComparator class
 */
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class AgeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return Integer.compare(a1.getAge(), a2.getAge());  // Sort by age (ascending order)
    }
 
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>(); // Arraylist to store the list of animals
        animals.add(new Animal("cat", 5));
        animals.add(new Animal("buffalo", 10));
        animals.add(new Animal("dog", 3));
        animals.add(new Animal("horse", 4));
        
     // Sorting animals by age using AgeComparator
        Collections.sort(animals, new AgeComparator());
        System.out.println("\nAnimals after sorting by age:");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " - Age: " + animal.getAge());
        }

	}

}