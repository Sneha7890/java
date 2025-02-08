package com.wipro.java.java8.usecase;

import java.time.LocalDate; 
/*
 * Creating Employee class that has Attributes as Id, name, deprtment, salary, joiningdate
 */
public class Employee { 
    private int id; 
    private String name; 
    private String department; 
    private double salary; 
    private LocalDate joiningDate; 
    
//Constructor to initialize object attributes
    public Employee(int id, String name, String department, double salary, LocalDate joiningDate) 
{ 
        this.id = id; 
        this.name = name; 
        this.department = department; 
        this.salary = salary; 
        this.joiningDate = joiningDate; 
    } 

    // Getter method to read the value from the private attribute
    public int getId() { return id; } 
    public String getName() { return name; } 
    public String getDepartment() { return department; } 
    public double getSalary() { return salary; } 
    public LocalDate getJoiningDate() { return joiningDate; } 
    
//Setter method to update the value for private attributes
    public void setName(String name) { this.name = name; } 
    public void setDepartment(String department) { this.department = department; } 
    public void setSalary(double salary) { this.salary = salary; } 

    @Override 
    public String toString() { 
        return "Employee { " + "ID=" + id + ", Name='" + name + '\'' +  
               ", Dept='" + department + '\'' + ", Salary=" + salary +  
               ", JoiningDate=" + joiningDate + " }"; 
    } 
} 
