package com.wipro.java.java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
 * Creating a class called NumberList
 * Sorting the arrays by .stream().sorted().collect(Collectors.toList());
 */
public class NumberList 
{
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3, 10, 17, 36, 39, 23, 4, 31, 50, 55, 3, 46, 47, 11);// Creating a list of Integers

        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());// Sorting Asc

        System.out.println("Sorted List: " + sortedNumbers);
    }

}