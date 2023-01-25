package com.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Intermediate {
public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	// Intermediate operation: filter
	Stream<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0);

	// Terminal operation: forEach
	evenNumbers.forEach(System.out::println);

}
}
