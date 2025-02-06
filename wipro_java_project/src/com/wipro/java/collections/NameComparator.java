package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class NameComparator implements Comparator<Animal> {
		    @Override
		    public int compare(Animal a1, Animal a2) {
		        return a1.getName().compareTo(a2.getName());  // Sort by name (ascending order)
		    }
		

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("cat", 5));
        animals.add(new Animal("buffalo", 10));
        animals.add(new Animal("dog", 3));
        animals.add(new Animal("horse", 4));

        // Sorting animals by name using NameComparator
        Collections.sort(animals, new NameComparator());
        System.out.println("Animals after sorting by name:");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " - Age: " + animal.getAge());
        }
	}

}
