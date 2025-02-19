package com.wipro.java.collections.linkedlist;

import java.util.Comparator;

public class Employee {
    
    int id;
    String name;
    double salary;
    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    // Static Comparator class to sort by salary
    public static class SalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee e1, Employee e2) {
            return Double.compare(e1.salary, e2.salary); // Ascending order
        }
    }
}
