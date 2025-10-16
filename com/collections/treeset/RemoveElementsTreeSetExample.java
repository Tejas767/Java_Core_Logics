package com.corejava.collections.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class RemoveElementsTreeSetExample {
	public static void main(String[] args) {
		// TreeSet stores elements in ascending order (no duplicates)
		NavigableSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);

		System.out.println("Original set: " + numbers);

		// remove(Object o) → removes a specific element
		numbers.remove(10);
		System.out.println("After removing 10: " + numbers);

		// removeIf(Predicate) → removes elements matching condition
		numbers.removeIf(num -> num % 2 == 0);
		System.out.println("After removing even numbers: " + numbers);

		// pollFirst() → removes and returns the smallest element
		numbers.pollFirst();
		System.out.println("After removing first element: " + numbers);

		// pollLast() → removes and returns the largest element
		numbers.pollLast();
		System.out.println("After removing last element: " + numbers);
	}
}
