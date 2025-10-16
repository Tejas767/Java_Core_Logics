package com.corejava.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingOverArrayList {
	public static void main(String[] args) {
		List<String> programmingLanguages = new ArrayList<>();
		programmingLanguages.add("Java");
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Python");
		programmingLanguages.add("JavaScript");
		programmingLanguages.add("Go");
		programmingLanguages.add("PHP");
		System.out.println(programmingLanguages);

		System.out.print("\nBy for loop : ");
		for (int i = 0; i < programmingLanguages.size(); i++) {
			System.out.print(programmingLanguages.get(i) + ", ");
		}

		System.out.print("\nBy forEach loop : ");
		for (String printlanguages : programmingLanguages) {
			System.out.print(printlanguages + ", ");
		}

		System.out.print("\nBy iterator : ");
		Iterator<String> itr = programmingLanguages.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}

		System.out.print("\nBy Java 8 forEachRemaining : ");
		programmingLanguages.iterator().forEachRemaining(element -> System.out.print(element + ", "));

		System.out.print("\nBy Java 8 forEach and lambda expression : ");
		programmingLanguages.forEach((element) -> {
			System.out.print(element + ", ");
		});
	}
}
