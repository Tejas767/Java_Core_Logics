package com.corejava.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class AccessHashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> fruitMap = new HashMap<String, Integer>();

		System.out.println(fruitMap.isEmpty());

		fruitMap.put("Apple", 10);
		fruitMap.put("Banana", 20);
		fruitMap.put("Orange", 15);
		fruitMap.put("Mango", 5);
		System.out.println(fruitMap);

		System.out.println(fruitMap.size());

		System.out.println(fruitMap.containsKey("Banana"));
	}
}
