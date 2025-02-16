package com.wipro.java.designpattern.factory;
/*
 * Abstract Factories
 * This is an interface that declares the methods for creating UI components
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
