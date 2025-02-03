/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Car {

	private String Brandname;
	private String Color;
	
	
	public String toString() {
		return "Car name is :" +Brandname+"Colour is :"+Color;
	}
	/**
	 * @return the brandname
	 */
	public String getBrandname() {
		return Brandname;
	}
	/**
	 * @param brandname the brandname to set
	 */
	public void setBrandname(String brandname) {
		this.Brandname = brandname;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return Color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.Color = color;
	}
	
	

	
}
		


