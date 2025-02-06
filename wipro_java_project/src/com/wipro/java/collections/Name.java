package com.wipro.java.collections;
/*
 * Name implements Movie1 
 * creating Name class
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


//Comparator to sort movies by rating
public class Name implements Comparator <Movie1> {
	public int compare(Movie1 m1, Movie1 m2) {
		
		//Sort by rating in descending order
		return m1.getName().compareTo(m2.getName());
	}
	public static void main(String[] args) {
		ArrayList<Movie1> m1 = new ArrayList<>();
		m1.add(new Movie1("Ayan", 8.7, 2007));
		m1.add(new Movie1("Interstellar", 8.9, 2014));
		m1.add(new Movie1("Spider-Man: No Way Home", 8.2, 2021));
		
		//Sort movies by rating and display all
        Collections.sort(m1, new Name());
        System.out.println("\nMovies sorted by name:");
        for(Movie1 m : m1) {
        	System.out.println(m.getName()+" "+m.getRating()+" "+m.getYear());
        	}
        }
}

