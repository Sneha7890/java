package com.wipro.java.java8;

@FunctionalInterface
interface Shape1 {
    // Only 1 abstract method
    void calculateArea(double value);

    // Default method 1
    default String display() {
        return "This is a shape.";
    }

    // Default method 2
    default String dimensions() {
        return "Shapes have different dimensions.";
    }

    // Static method 1
    static String shapeType() {
        return "Shapes can be Circle, Square, or Rectangle.";
    }

    // Static method 2
    static String formula() {
        return "Circle: πr², Square: a², Rectangle: l × w.";
    }
}

class Shape implements Shape1 {
    // Implementation of abstract method
    public void calculateArea(double value) {
        System.out.println("Area: " + (value * value));
    }

}
