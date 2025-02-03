package com.wipro.java.oops.encapsulation;

public class Animal {

    private String name;
    private String color;
    private String species; // New attribute
    private int age; // New attribute

    // Constructor
    public Animal(String name, String color, String species, int age) {
        super();  // calls the root parent class = Object
        this.name = name;
        this.color = color;
        this.species = species;
        this.age = age;
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter and Setter methods for species
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // Getter and Setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String a[]) {
        // Creating an instance of Animal with all attributes
        Animal p1 = new Animal("Cat", "white", "Mammal", 3);
        
        // Accessing attributes using getters
        System.out.println("Name: " + p1.getName());
        System.out.println("Color: " + p1.getColor());
        System.out.println("Species: " + p1.getSpecies());
        System.out.println("Age: " + p1.getAge());
        
        // You can also modify the attributes using setters if needed
        p1.setColor("black");
        p1.setAge(4);
        
        System.out.println("\n");
        System.out.println("Name: " + p1.getName());
        System.out.println("Color: " + p1.getColor());
        System.out.println("Species: " + p1.getSpecies());
        System.out.println("Age: " + p1.getAge());
    }
}
