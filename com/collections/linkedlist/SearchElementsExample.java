package com.corejava.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class SearchElementsExample {
	public static void main(String[] args) {

		List<String> fruits = new LinkedList<>();
		fruits.add("Apple"); // 0
		fruits.add("Banana"); // 1
		fruits.add("Cherry"); // 2
		fruits.add("Mango"); // 3
		fruits.add("Orange"); // 4
		fruits.add("Orange"); // 5
		fruits.add("Grapes"); // 6

		System.out.println(fruits);

		// contains(Object o) → checks if element is present in the list
		Boolean containsMango = fruits.contains("Mango");
		System.out.println(containsMango); // true

		// indexOf(Object o) → returns index of the first occurrence
		int index = fruits.indexOf("Orange");
		System.out.println(index);

		// lastIndexOf(Object o) → returns index of the last occurrence
		int lastIndex = fruits.lastIndexOf("Orange");
		System.out.println(lastIndex);
	}
}
