package com.wipro.java.oops.abstraction;

/**
 * Main class to test the abstraction concept.
 */
public class Main {
    public static void main(String[] args) {
       
        Car myTesla = new Tesla();
        myTesla.startEngine();
        myTesla.sound();
        myTesla.stopEngine();
        
       
        Car myFord = new Ford();
        myFord.startEngine();
        myFord.sound();
        myFord.stopEngine();
    }
}
