package com.wipro.java.designpattern.factory;

/*
 * Concrete Factories
 * MacFactory creates Mac UI components
 */
public class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
