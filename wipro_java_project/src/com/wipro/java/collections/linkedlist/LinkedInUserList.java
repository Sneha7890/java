package com.wipro.java.collections.linkedlist;

class LinkedInUserList {
    UserProfile head; // Head of the linked list

    // Add a new user to the end of the list
    public void addUser(String name, String jobTitle, String company) {
        UserProfile newUser = new UserProfile(name, jobTitle, company);
        if (head == null) {
            head = newUser;
        } else {
            UserProfile temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    // Display all user profiles
    public void displayUsers() {
        if (head == null) {
            System.out.println("No users found.");
            return;
        }
        UserProfile temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }
}
