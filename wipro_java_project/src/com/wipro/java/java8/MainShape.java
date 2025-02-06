package com.wipro.java.java8;

public class MainShape {
	// The main method must be inside the class which is the entry point
    public static void main(String[] args) {
        Shape1 shape = new Shape();
        shape.calculateArea(4);

        // Calling default methods
        System.out.println(shape.display());
        System.out.println(shape.dimensions());

        // Calling static methods
        System.out.println(Shape1.shapeType());
        System.out.println(Shape1.formula());
    }
}
