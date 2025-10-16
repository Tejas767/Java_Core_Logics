package com.corejava.collections.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class ObtainEntryKeySetExample {
	public static void main(String[] args) {
		Map<String, Integer> fruitMap = new HashMap<>();
		fruitMap.put("Apple", 10);
		fruitMap.put("Banana", 20);
		fruitMap.put("Orange", 15);
		fruitMap.put("Mango", 5);

		// get entry set (key-value pairs)
		Set<Map.Entry<String, Integer>> entries = fruitMap.entrySet();
		System.out.println("Entries: " + entries);
		
		// get all keys
		Set<String> keys = fruitMap.keySet();
		System.out.println("Keys: " + keys);
		
		// get all values
		Collection<Integer> values = fruitMap.values(); 
		System.out.println("Values: " + values);
	}
}
