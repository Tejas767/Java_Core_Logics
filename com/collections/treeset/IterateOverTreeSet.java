package com.corejava.collections.treeset;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class IterateOverTreeSet {
	public static void main(String[] args) {

		// TreeSet stores elements in sorted (ascending) order
		NavigableSet<String> fruits = new TreeSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("Mango");
		fruits.add("Orange");

		System.out.println("Original TreeSet: " + fruits);

		// 1. Enhanced for-each loop
		System.out.print("Using for-each: ");
		for (String printFruits : fruits) {
			System.out.print(printFruits + ", ");
		}

		// 2. Using Iterator
		System.out.println();
		System.out.print("Using Iterator: ");
		Iterator<String> itr = fruits.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}

		// 3. Java 8 forEachRemaining() with lambda
		System.out.println();
		System.out.print("Using forEachRemaining: ");
		fruits.iterator().forEachRemaining(fruit -> System.out.print(fruit + ", "));

		// 4. Using descendingIterator() → reverse order
		System.out.println();
		System.out.print("Using descendingIterator: ");
		Iterator<String> reverseItr = fruits.descendingIterator();
		while (reverseItr.hasNext()) {
			System.out.print(reverseItr.next() + ", ");
		}

		// 5. Java 8 forEach() with lambda
		System.out.println();
		System.out.print("Using forEach + lambda: ");
		fruits.forEach(fruit -> System.out.print(fruit + ", "));
	}
}
