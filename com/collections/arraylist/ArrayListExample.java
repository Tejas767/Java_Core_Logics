package com.corejava.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();

		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Dog");

		// Duplicate elements are allowed in ArrayList
		animals.add("Lion");

		// Multiple null values are allowed in ArrayList
		animals.add(null);

		// Add an element at a specific index (shifts elements to the right)
		animals.add(1, "Elephant");

		// Print the entire list
		System.out.println(animals);

		// Get the element at a specific index
		System.out.println(animals.get(1));

		// searching element
		Boolean hasElement = animals.contains("Cat");
		System.out.println(hasElement);
	}
}
