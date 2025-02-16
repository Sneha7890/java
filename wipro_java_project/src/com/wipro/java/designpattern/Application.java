package com.wipro.java.designpattern;

/*
 * Client using the factory
 * The Application class uses a factory to create UI elements and render them
 */
import com.wipro.java.designpattern.factory.*;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        checkbox.render();
    }
}
