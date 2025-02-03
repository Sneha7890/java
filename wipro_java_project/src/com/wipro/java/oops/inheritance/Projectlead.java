package com.wipro.java.oops.inheritance;
/**
 * Parent class = Employee
 * child class = Projectlead
 * extends = keyword
 */
public class Projectlead extends Employee{

	public Projectlead() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		// child object is instantiated from child constructor
    	//parent class consumes the prop and behaviors of child class
		
    Employee employee = new Projectlead(); //Creating instance for the constructor
    employee.setEmpid(136);  // setting the value for Empid
    employee.setEmpname("Sneha");// setting the value for empname
    employee.setEmprole("Projectlead");// setting the value for emprole
    employee.setSalary(300000f);//setting the value for salary
    
    System.out.println(employee.getEmpid()); 
    System.out.println(employee.getEmpname());
    System.out.println(employee.getEmprole());
    System.out.println(employee.getSalary());
	}
}
