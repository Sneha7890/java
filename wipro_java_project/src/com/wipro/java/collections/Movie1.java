package com.wipro.java.collections;
/*
 * Using Comparator
 * Creating Movie1 class
 */
public class Movie1 {
	private String n;
	private double r;
	private int y;
// Constructor
	public Movie1(String n, double r, int y) {
		this.n=n;
		this.r=r;
		this.y=y;
	}
//getter methods to access the private variables
	public String getName() {
		return n;
	}

	public double getRating() {
		return r;
	}

	public int getYear() {
		return y;
	}

}
