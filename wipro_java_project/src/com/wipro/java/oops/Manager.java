/**
 * 
 */
package com.wipro.java.oops;

/**
 * Parent class = Employee
 * child class = manager
 * extends = keyword
 */
public class Manager extends Employee{

	/**
	 * 
	 */
	public Manager() {
	}
	public static void main(String[] args) {
		
		// child object is instantiated from child constructor
    	//parent class consumes the prop and behaviours of child class
		
    Employee employee = new Manager();//Creating instance for the constructor
    employee.setEmpid(137);// setting the value for Empid
    employee.setEmpname("Suriya");// setting the value for empname
    employee.setEmprole("Manager");// setting the value for emprole
    employee.setSalary(200000f);//setting the value for salary
    
    System.out.println(employee.getEmpid());
    System.out.println(employee.getEmpname());
    System.out.println(employee.getEmprole());
    System.out.println(employee.getSalary());

}
}
