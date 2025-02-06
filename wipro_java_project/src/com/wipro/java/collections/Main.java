package com.wipro.java.collections;
/*
 * Using Comparable
 * Creating main class for movie
 */
import java.util.ArrayList;
import java.util.Collections;
public class Main {

	public static void main(String[] args) {
		
		//Creating a List of Movies
		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(new Movie("Star Wars", 8.7, 1977));
		movies.add(new Movie("Interstellar", 8.7, 2014));
		movies.add(new Movie("Spider-Man: No Way Home", 8.2, 2021));
		
		//Sort movies using Comparable's
		//comapreTo method by the year
		
		Collections.sort(movies);
		
		//Display the sorted list of movies
		System.out.println("Movies after sorting by year:");
		for (Movie m : movies ) {
			System.out.println(m.getName()+ " "+ m.getRating() + " "+ m.getYear());
		}
	}

}
