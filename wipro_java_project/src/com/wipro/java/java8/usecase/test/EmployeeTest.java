package com.wipro.java.java8.usecase.test;

/*
 * Testing the Employee class using EmployeeTestclass
 */
import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import com.wipro.java.java8.usecase.Employee;

public class EmployeeTest {
    private Employee employee;

    @Before
    public void setUp() {  
        employee = new Employee(1, "Sneha", "IT", 50000.0, LocalDate.of(2020, 5, 10));
    }

    @Test
    public void testGetters() {
        assertEquals(1, employee.getId());
        assertEquals("Sneha", employee.getName());
        assertEquals("IT", employee.getDepartment());
        assertEquals(50000.0, employee.getSalary(), 0.01);
        assertEquals(LocalDate.of(2020, 5, 10), employee.getJoiningDate());
    }

    @Test
    public void testSetters() {
        employee.setName("Swetha");
        assertEquals("Swetha", employee.getName());

        employee.setDepartment("HR");
        assertEquals("HR", employee.getDepartment());

        employee.setSalary(60000.0);
        assertEquals(60000.0, employee.getSalary(), 0.01);
    }

    @Ignore("For manual verification only. Remove @Ignore to run this test.")
    @Test
    public void printEmployeeDetails() {
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Joining Date: " + employee.getJoiningDate());
        System.out.println("Employee Details: " + employee.toString());
    }
}
