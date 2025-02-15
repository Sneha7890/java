package com.wipro.java.designpattern.factory;
//Concrete Products
public class WindowsButton implements Button {
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}
