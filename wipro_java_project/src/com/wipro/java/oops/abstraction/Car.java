package com.wipro.java.oops.abstraction;

/**
 * Abstract class representing a generic car.
 */
public abstract class Car {
    // Abstract methods 
    abstract void startEngine();
    abstract void stopEngine();

    // Concrete method
    public void sound() {
        System.out.println("Car is honking");
    }
}
