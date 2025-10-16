package com.corejava.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RemoveHashMap {
	public static void main(String[] args) {

		Map<String, Integer> fruitMap = new HashMap<String, Integer>();
		fruitMap.put("Apple", 10);
		fruitMap.put("Banana", 20);
		fruitMap.put("Orange", 15);
		fruitMap.put("Mango", 5);

		System.out.println(fruitMap);

		fruitMap.remove("Banana");
		System.out.println(fruitMap);

		System.out.println(fruitMap.remove("Mango", 5));
		System.out.println(fruitMap);
		
	}

}
