/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Tesla extends Car {

	public static void main(String[] args) {
		Car tesla = new Tesla();
		tesla.setBrandname("TESLA");
		tesla.setColor("Red");	
		
		System.out.println(tesla.getBrandname());
		System.out.println(tesla.getColor());
		
		
	}

}
