package com.corejava.collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateOverHashMap {
	public static void main(String[] args) {
		Map<String, Integer> fruitMap = new HashMap<>();
		fruitMap.put("Apple", 10);
		fruitMap.put("Banana", 20);
		fruitMap.put("Orange", 15);
		fruitMap.put("Mango", 5);

		// using forEach and lambda
		System.out.println("Using forEach and lambda:");
		fruitMap.forEach((key, value) -> System.out.println(key + " : " + value));

		// using iterator and entry set
		System.out.println("\nUsing iterator and entry set:");
		Iterator<Map.Entry<String, Integer>> itr = fruitMap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// using forEach on entry set
		System.out.println("\nUsing forEach on entry set:");
		fruitMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

		// using enhanced for loop
		System.out.println("\nUsing enhanced for loop:");
		for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		// using keySet and get()
		System.out.println("\nUsing keySet and get():");
		fruitMap.keySet().forEach(key -> System.out.println(key + " : " + fruitMap.get(key)));
	}
}
