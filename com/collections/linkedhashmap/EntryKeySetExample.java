package com.corejava.collections.linkedhashmap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class EntryKeySetExample {
	public static void main(String[] args) {

		Map<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		lhm.put("One", 1);
		lhm.put("Two", 2);
		lhm.put("Three", 3);
		lhm.put("Four", 4);
		System.out.println(lhm);

		Set<Map.Entry<String, Integer>> entries = lhm.entrySet();
		System.out.println(entries);

		Set<String> keys = lhm.keySet();
		System.out.println(keys);

		Collection<Integer> values = lhm.values();
		System.out.println(values);
	}
}
