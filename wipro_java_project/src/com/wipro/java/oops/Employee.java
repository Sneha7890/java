/**
 * 
 */
package com.wipro.java.oops;
/**
 * POJO Plane old java object thru getter and setter method
 * No constructor
 * getter have return value
 * setter have no return value
 * prop are determine using private fields
 * value are behaviors are determine via setters
 * toString will convert entire animal class with properties and behaviors
 */
public class Employee {
	   private int Empid; // This is EmployeeId
	   private String Empname; // This is Employee name
	   private String Emprole; // This is EmployeeDesignation
	   private double salary; // This is salary
	   
	
	/**
	 * @return the empid
	 */
	public int getEmpid() {
		return Empid;
	}

	/**
	 * @param empid the empid to set
	 */
	public void setEmpid(int empid) {
		Empid = empid;
	}
	/**
	 * @return the empname
	 */
	public String getEmpname() {
		return Empname;
	}
	/**
	 * @param empname the empname to set
	 */
	public void setEmpname(String empname) {
		Empname = empname;
	}
	/**
	 * @return the emprole
	 */
	public String getEmprole() {
		return Emprole;
	}
	/**
	 * @param emprole the emprole to set
	 */
	public void setEmprole(String emprole) {
		Emprole = emprole;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salray the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}


