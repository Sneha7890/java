/**
 * 
 */
package com.wipro.javainterface;

/**
 * Implementing Multiple Interface
 * 
 * Document implements two interfaces which is Printable and Showable
 */
public class Document implements Printable, Showable {

	
	 //d1.print() method is called here
	public void print(){
		System.out.println("print");
	}

	// d1.show() method is called here
	public void show(){
		System.out.println("show");
	}

	//Main method
	public static void main(String[] args) {
		Document d1 = new Document();
		d1.print(); // output : print
		d1.show();  // output : show
		
	}

}
