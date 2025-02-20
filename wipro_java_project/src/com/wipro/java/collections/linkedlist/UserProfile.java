package com.wipro.java.collections.linkedlist;

class UserProfile {
    String name;
    String jobTitle;
    String company;
    UserProfile next; // Pointer to the next user

    UserProfile(String name, String jobTitle, String company) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.company = company;
        this.next = null;
    }

    public String toString() {
        return name + " - " + jobTitle + " at " + company;
    }
}

