package com.wipro.java.java8;
import java.util.Arrays;
import java.util.List;
/*
 * Creating class called Minmax
 * Finding the min value by using stream().min(Integer::compare).get();
 *  Finding the max value by using stream().max(Integer::compare).get();
 */
public class MinMax
{
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 25, 30);// Creating list of of Integers

        int min = numbers.stream().min(Integer::compare).get();// finding the min value
        int max = numbers.stream().max(Integer::compare).get();// finding the max value

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

}