package com.wipro.java.designpattern;

/*
 * Main class
 *  It decides which factory to use (Mac or Windows) and creates an Application using that factory
 */
import com.wipro.java.designpattern.factory.*;
import java.util.Scanner; // Import Scanner for user input

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter OS type (Mac/Windows): ");
        String osType = scanner.nextLine().trim(); // Read user input

        GUIFactory factory;

        if (osType.equalsIgnoreCase("Mac")) { 
            factory = new MacFactory();
        } else if (osType.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else {
            System.out.println("Invalid OS type!");
          return;
        }

        scanner.close(); // Close scanner

        Application app = new Application(factory);
        app.renderUI();
    }
}
