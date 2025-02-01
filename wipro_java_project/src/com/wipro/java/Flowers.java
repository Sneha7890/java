/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Flowers {

	String flowername;
	String flowercolour;
    Flowers(String name, String colour) {
		this.flowername=name;
		this.flowercolour=colour;
	}
void display() {
	System.out.println("Flower name:"+flowername+"Flower colour:"+flowercolour);
}
	
    
	public static void main(String[] args) {
	Flowers f1=new Flowers("Rose","Red");
	Flowers f2=new Flowers("Jasmine","White");
	f1.display();
	f2.display();
	}

}
