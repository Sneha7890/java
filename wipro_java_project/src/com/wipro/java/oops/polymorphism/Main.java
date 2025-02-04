package com.wipro.java.oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        // Runtime Polymorphism (Method Overriding)
        Animal myAnimal = new Dog();
        myAnimal.makeSound();  // Output: Dog barks

        myAnimal = new Cat();
        myAnimal.makeSound();  // Output: Cat meows
    }
}
