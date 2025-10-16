package com.corejava.collections.linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class IterateOverLinkedHashMap {
	public static void main(String[] args) {

		Map<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		lhm.put("One", 1);
		lhm.put("Two", 2);
		lhm.put("Three", 3);
		lhm.put("Four", 4);
		System.out.println(lhm);

		System.out.println("\nUsing forEach");
		lhm.forEach((key, value) -> System.out.print(key + " " + value + " | "));

		System.out.println("\n\nUsing entrySet and forEach");
		lhm.entrySet().forEach((entries) -> System.out.print(entries.getKey() + " " + entries.getValue() + " | "));

		System.out.println("\n\nUsing Iterator");
		Iterator<Map.Entry<String, Integer>> itr = lhm.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			System.out.print(entry.getKey() + " " + entry.getValue() + " | ");
		}

		System.out.println("\n\nUsing forEachRemaining");
		Iterator<Map.Entry<String, Integer>> itrForEachRemaining = lhm.entrySet().iterator();
		itrForEachRemaining
				.forEachRemaining(entry -> System.out.print(entry.getKey() + " " + entry.getValue() + " | "));
	}
}
