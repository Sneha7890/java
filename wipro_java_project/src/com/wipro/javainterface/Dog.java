/**
 * 
 */
package com.wipro.javainterface;

/**
 * Dog implements Animal
 */
public class Dog implements Animal{

	//dog1.makesound() method is called
	public void makesound() {
	System.out.println("Bow Bow");
	}

	// Main method
	public static void main(String[] args) {
		Animal dog1 = new Dog(); // Creating objects for Dog 
		dog1.makesound(); // Output: Bow Bow

	}

}
