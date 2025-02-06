package com.wipro.java.collections;

/*
 * Rating Implements Movie1 by using Comparator
 * Creating Rating class
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Comparator to sort movies by rating
public class Rating implements Comparator <Movie1> {
	public int compare(Movie1 m1, Movie1 m2) {
		
		//Sort by rating in descending order
		return Double.compare(m2.getRating(), m1.getRating());
	}
	public static void main(String[] args) {
		ArrayList<Movie> m1 = new ArrayList<>();
		m1.add(new Movie("Star Wars", 8.7, 1977));
		m1.add(new Movie("Interstellar", 8.5, 2014));
		m1.add(new Movie("Spider-Man: No Way Home", 8.2, 2021));
		
		//Sort movies by rating and display all
        Collections.sort(m1);
		
		//Display the sorted list of movies
		System.out.println("Movies sorted by Rating:");
		for (Movie m : m1 ) {
			System.out.println(m.getName()+ " "+ m.getRating() + " "+ m.getYear());
		}
	}
}
