package com.corejava.collections.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		lhm.put("One", 1);
		lhm.put("Two", 2);
		lhm.put("Three", 3);
		lhm.put("Four", 4);
		System.out.println(lhm);

		lhm.putIfAbsent("Five", 5);
		lhm.putIfAbsent("Five", 10);// this not added because key is already there
		System.out.println(lhm);

		lhm.put("Five", 10); // by using put we can also update
		System.out.println(lhm);

		System.out.println(lhm.containsKey("Five"));

		System.out.println(lhm.containsValue(5));

		lhm.remove("Two");
		System.out.println(lhm);

		lhm.remove("Three", 3);
		System.out.println(lhm);

		lhm.clear();
		System.out.println(lhm);
	}
}
