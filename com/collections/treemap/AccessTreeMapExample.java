package com.corejava.collections.treemap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class AccessTreeMapExample {
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

		System.out.println("Product List and Prices: " + productPrices);

		System.out.println("Total number of products: " + productPrices.size());

		System.out.println("Does the map contain 'Tablet'? " + productPrices.containsKey("Tablet"));

		// Methods of navigable map
		System.out.println("First key (alphabetically): " + productPrices.firstKey());

		System.out.println("Last key (alphabetically): " + productPrices.lastKey());

		System.out.println("Key lower than 'Tablet': " + productPrices.lowerKey("Tablet"));

		System.out.println("Key higher than 'Tablet': " + productPrices.higherKey("Tablet"));
	}
}
