/**
 * 
 */
package com.wipro.javainterface;

/**
 * Cat implements Animal
 */
public class Cat implements Animal{

	//cat1.makesound() method is called here
	public void makesound() {
		System.out.println("Meow Meow");
	}

	// Main method
	public static void main(String[] args) {
		
		Animal cat1 = new Cat(); //Object is created for Cat
		cat1.makesound(); //Output: Meow Meow

	}

}
