package com.wipro.java.collections.linkedlist;

import java.util.Scanner;

public class MainLinkedIn {
	
	public static void main(String[] args) {
        LinkedInUserList userList = new LinkedInUserList();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of users: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details for User " + i + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Job Title: ");
            String jobTitle = scanner.nextLine();
            System.out.print("Company: ");
            String company = scanner.nextLine();

            userList.addUser(name, jobTitle, company);
        }

        // Display all user profiles
        System.out.println("\nLinkedIn User List:");
        userList.displayUsers();

        scanner.close();
    }
}


