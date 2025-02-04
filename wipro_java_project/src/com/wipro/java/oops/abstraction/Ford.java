package com.wipro.java.oops.abstraction;

/**
 * Concrete class extending the abstract Car class.
 */
public class Ford extends Car {
    @Override
    void startEngine() {
        System.out.println("Ford started.");
    }

    @Override
    void stopEngine() {
        System.out.println("Ford  stopped.");
    } 
}
