package com.corejava.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {

		Set<String> daysOfWeek = new HashSet<>();
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Thursday");
		daysOfWeek.add("Friday");
		daysOfWeek.add("Saturday");
		daysOfWeek.add("Sunday");

		// duplicate not allowed
		daysOfWeek.add("Monday");

		// only one null value is allowed
		daysOfWeek.add(null);

		// does not keep elements in sorted order or insertion order
		System.out.println(daysOfWeek);

		// checks if element is present in set
		System.out.println(daysOfWeek.contains("Monday"));

		// returns number of unique elements in set
		System.out.println(daysOfWeek.size());

		// checks if set is empty or not
		System.out.println(daysOfWeek.isEmpty());

	}
}
