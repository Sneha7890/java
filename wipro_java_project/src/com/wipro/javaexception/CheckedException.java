
package com.wipro.javaexception;
import java.io.*;

public class CheckedException {
	    public static void main(String[] args) {
	        try {
	            FileReader file = new FileReader("test.txt");  // May cause FileNotFoundException
	            BufferedReader br = new BufferedReader(file);
	            System.out.println(br.readLine());
	            br.close();
	        } catch (IOException e) {
	            System.out.println("File not found or error reading file: " + e.getMessage());
	        }
	         finally {
	        	 System.out.println("Execution completed:");
	         }
	    }
	    
	}



