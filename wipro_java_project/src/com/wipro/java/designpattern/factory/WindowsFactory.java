package com.wipro.java.designpattern.factory;

/*
 * Concrete Factories
 * WindowsFactory creates Windows UI components
 */
public class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
