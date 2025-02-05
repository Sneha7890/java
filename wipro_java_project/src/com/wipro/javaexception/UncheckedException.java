package com.wipro.javaexception;

public class UncheckedException {
	    public static void main(String[] args) {
	        
	    	
	    	try 
	    	{
	        	String str= null;
	        	System.out.println(str.length());
	        } catch (Exception e) {
	            System.out.println(e.getStackTrace()); //"Error: Cannot divide by zero.");
	        }
	        try 
	        {
	        	int num =7/0; // ArithmeticException
	        }
	        catch (Exception e) 
	        {
	        	System.out.println("Error: Cannot divide by zero.");
	        }
	        finally {
	        	 System.out.println("Execution completed:");
	         }
	    }
	}


