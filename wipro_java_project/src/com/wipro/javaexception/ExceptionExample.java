package com.wipro.javaexception; // Package declaration

import java.io.*;

public class ExceptionExample {
    public static void main(String[] args) {
        ExceptionExample obj = new ExceptionExample();

        // Unchecked Exception (Runtime Exception)
        try {
            int result = 10 / 0; // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception: " + e.getMessage());
        }

        // Checked Exception (Compile-time Exception)
        try {
            obj.readFile(); // This may cause IOException
        } catch (IOException e) {
            System.out.println("Caught Checked Exception: " + e.getMessage());
        }

        System.out.println("Program execution completed.");
    }

    // Method that throws a Checked Exception
    public void readFile() throws IOException {
        FileReader file = new FileReader("test.txt"); // May throw FileNotFoundException
        file.close();
    }
}
