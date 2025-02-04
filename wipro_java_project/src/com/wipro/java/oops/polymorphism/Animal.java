
package com.wipro.java.oops.polymorphism;

//Parent class
public class Animal {
 void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

//Child class 1
class Dog extends Animal {
 @Override
 void makeSound() {
     System.out.println("Dog barks");
 }
}

//Child class 2
class Cat extends Animal {
 @Override
 void makeSound() {
     System.out.println("Cat meows");
 }

//Main class
 public static void main(String[] args) {
     // Parent class reference pointing to child class objects (Runtime Polymorphism)
     Animal myAnimal=new Dog();
     myAnimal.makeSound();  // Dog barks
     Animal myAnimal1 = new Cat();
     myAnimal1.makeSound();  //  Cat meows
 }
}
