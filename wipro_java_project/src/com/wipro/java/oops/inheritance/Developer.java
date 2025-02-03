/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * Parent class Employee
 * Child class Developer
 * extends is a keyword
 */
public class Developer extends Employee{

	/**
	 * 
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		// child object is instantiated from child constructor
    	//parent class consumes the prop and behaviors of child class
		
		
    Employee employee = new Developer();//Creating instance for the constructor
    employee.setEmpid(138);//setting the value for Empid
    employee.setEmpname("Swetha");//setting the value for Empname
    employee.setEmprole("Developer");//setting the value for Emprole
    employee.setSalary(100000f);//setting the value for salary
    
    System.out.println(employee.getEmpid());
    System.out.println(employee.getEmpname());
    System.out.println(employee.getEmprole());
    System.out.println(employee.getSalary());

}
}

