package com.corejava.collections.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class IterateTreeMapExample {
	public static void main(String[] args) {

		NavigableMap<String, Double> productPrices = new TreeMap<String, Double>();
		productPrices.put("Laptop", 79999.99);
		productPrices.put("Smartphone", 45999.50);
		productPrices.put("Headphones", 2499.00);
		productPrices.put("Smartwatch", 9999.99);
		productPrices.put("Tablet", 27999.00);
		productPrices.put("Keyboard", 1499.50);
		productPrices.put("Mouse", 799.00);
		productPrices.put("Monitor", 12499.00);

		// allows us to increment in lambda expression
		AtomicInteger no = new AtomicInteger(1);

		// using for each
		productPrices.forEach((key, value) -> System.out.println(no.getAndIncrement() + ". " + key + " = " + value));

		// using iterator
		Iterator<Map.Entry<String, Double>> itr = productPrices.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Double> entry = itr.next();
			System.out.println(no.getAndIncrement() + ". " + entry.getKey() + "= " + entry.getValue());
		}

		// only keys
		System.out.println("\nOnly Keys: ");
		for (String keys : productPrices.keySet()) {
			System.out.println(keys);
		}

		// only values
		System.out.println("\nOnly Values: ");
		for (Double price : productPrices.values()) {
			System.out.println(price);
		}
	}
}
