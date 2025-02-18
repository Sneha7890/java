package com.wipro.java.collections.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSorting {

    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();

        // Adding employees
        employees.add(new Employee(101, "Alice", 60000));
        employees.add(new Employee(102, "Bob", 50000));
        employees.add(new Employee(103, "Charlie", 70000));

        // Sorting using Comparator
        Collections.sort(employees, new Employee.SalaryComparator());

        // Printing sorted list
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
