package com.wipro.java.designpattern.factory;
//Concrete Products
public class WindowsCheckbox implements Checkbox {
    public void render() {
        System.out.println("Rendering Windows Checkbox");
    }
}
