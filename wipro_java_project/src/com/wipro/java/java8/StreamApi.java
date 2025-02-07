package com.wipro.java.java8;
/*
 * StreamApi
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamApi {
       public static void main(String[] args) {
			
			List<String> list= Arrays.asList("Sneha","Monica","Kavi");
			List<String> stream = list.stream().
					filter(name->name.startsWith("K")).
					collect(Collectors.toList());
			System.out.println(stream);
			List<String> stream1 = list.stream().
					map(String::toUpperCase).collect(Collectors.toList());
			System.out.println(stream1);
		
	}

}
