package com.corejava.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {

		Map<String, Integer> number = new HashMap<>();
		number.put("One", 1);
		number.put("Two", 2);
		number.put("Three", 3);
		number.put("Four", 4);
		number.put("Five", 5);
		System.out.println(number);

		// add if key absent
		number.putIfAbsent("Six", 6);
		System.out.println(number);

		// replace value for existing key
		number.put("One", 7);
		System.out.println(number);

		// add null key (only one allowed)
		number.put(null, null);
		System.out.println(number);

		// check if value exists
		System.out.println(number.containsValue(3));

		// get value by key
		System.out.println(number.get("Four"));
	}
}
