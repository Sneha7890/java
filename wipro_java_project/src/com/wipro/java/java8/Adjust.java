package com.wipro.java.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Adjust {
    public static void main(String[] args) {
        // Get the current date
        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        // Create a specific date
        LocalDate specificDate = LocalDate.of(2024, 2, 6);
        System.out.println("Specific Date: " + specificDate);

        // Add and subtract days
        LocalDate nextWeek = today.plusDays(7);
        LocalDate previousMonth = today.minusMonths(1);
        
        System.out.println("Next Week: " + nextWeek);
        System.out.println("Previous Month: " + previousMonth);

        // Formatting a LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);

        // Check if it's a leap year
        boolean isLeapYear = today.isLeapYear();
        System.out.println("Is Leap Year? " + isLeapYear);

        // Get day of the week
        System.out.println("Day of the Week: " + today.getDayOfWeek());
    }
}
