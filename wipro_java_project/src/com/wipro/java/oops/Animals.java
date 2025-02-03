/**
 * 
 */
package com.wipro.java.oops;

/**
 * POJO Plane old java object thru getter and setter method
 * No constructor
 * getter have return value
 * setter have no return value
 * prop are determine using private fields
 * value are behaviors are determine via setters
 * toString will convert entire animal class with properties and behaviors
 */
public class Animals {
// Private Properties =structure
	private String name; // this is animal name
	private String Species; // this is animal species
	private String color; // this is animal color
	private float weight; // this is animal weight
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the species
	 */
	public String getSpecies() {
		return Species;
	}
	/**
	 * @param species the species to set
	 */
	public void setSpecies(String species) {
		Species = species;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the weight
	 */
	public float getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
