package com.wipro.java.java8;
/*
 * Demonstrating 2 Default method 
 * interface ->TestInterface1 & TestInterface2
 * 
 */
interface TestInterface1{
	
	// Default constructor
	default void show() {
		System.out.println("Default Testinterface1");
	}
}
    //Default Constructor
interface TestInterface2{
	default void show() {
		System.out.println("Default Testinterface2");
	}
}
// DefaultUseCase implements two interfaces TestInterface1, TestInterface2
class DefaultUseCase implements TestInterface1, TestInterface2 {
public void show() {
	TestInterface1.super.show();// calls the TestInterface1 interface1 method
    TestInterface2.super.show();// calls the TestInterface1 interface2 method
	
}
//Main class
public static void main(String args[]) {
	DefaultUseCase d = new DefaultUseCase();//Instance objects
	d.show();
   }
}


