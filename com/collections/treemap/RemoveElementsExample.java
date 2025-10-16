package com.corejava.collections.treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class RemoveElementsExample {
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

		productPrices.remove("Smartphone");
		System.out.println(productPrices);

		productPrices.remove("Laptop", 79999.99);
		System.out.println(productPrices);

		Map.Entry<String, Double> firstEntry = productPrices.pollFirstEntry();
		System.out.println("removed first: " + firstEntry);
		System.out.println(productPrices);

		Map.Entry<String, Double> lastEntry = productPrices.pollLastEntry();
		System.out.println("removed last: " + lastEntry);
		System.out.println(productPrices);

	}
}
