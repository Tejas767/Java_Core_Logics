package com.corejava.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayList {
	public static void main(String[] args) {

		List<String> topCompanies = new ArrayList<String>();

		// isEmpty() method checks if the list has no elements
		// Returns true if empty, false otherwise
		System.out.println(topCompanies.isEmpty());

		topCompanies.add("Google");
		topCompanies.add("Microsoft");
		topCompanies.add("Capgemini");
		topCompanies.add("TCS");
		topCompanies.add("Wipro");

		// size() method returns the number of elements in the list
		System.out.println(topCompanies.size());

		// get(index) method returns the element at the specified position
		System.out.println(topCompanies.get(0));

		// set(index, element) method replaces the element at the specified position
		topCompanies.set(0, "Facebook");
		System.out.println(topCompanies);
	}
}
