package com.wipro.javaexception;


public class TwoNumbers {
    public static void main(String[] args) {
        
    	// Declaring and initialising the variables
    	 int num1=7, num2=0;
    	 
    	 //try & catch block
        try {
          
            int result = num1 / num2;

            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
         finally {
            System.out.println("Execution completed.");
        }
    }
}
