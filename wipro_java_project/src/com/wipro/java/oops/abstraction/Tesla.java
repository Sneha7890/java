package com.wipro.java.oops.abstraction;

/**
 * Concrete class extending the abstract Car class.
 */
public class Tesla extends Car {
    @Override
    void startEngine() {
        System.out.println("Tesla started.");
    }

    @Override
    void stopEngine() {
        System.out.println("Tesla stopped.");
    }
}
