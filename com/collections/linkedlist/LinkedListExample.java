package com.corejava.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");

		// Add element at a specific index
		list.add(1, "Mango");

		// These methods are specific to LinkedList, not List
		// Add element at the beginning of the list
		list.addFirst("Pineapple");

		// Add element at the end of the list
		list.addLast("Grapes");

		List<String> moreFruits = new LinkedList<>();
		moreFruits.add("Orange");
		moreFruits.add("Watermelon");

		System.out.println(list);

		// Add all elements from moreFruits to the main list
		list.addAll(moreFruits);
		System.out.println(list);

		// Get first element
		String firstFruit = list.getFirst();
		System.out.println("First fruit: " + firstFruit);

		// Get last element
		String lastFruit = list.getLast();
		System.out.println("Last fruit: " + lastFruit);

		// Get element at index
		System.out.println(list.get(0));
	}
}
