package com.corejava.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateOverHashSet {
	public static void main(String[] args) {

		Set<String> programmingLanguages = new HashSet<String>();
		programmingLanguages.add("Java");
		programmingLanguages.add("C");
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Python");
		programmingLanguages.add("Python");
		programmingLanguages.add("JavaScript");
		programmingLanguages.add("Go");
		programmingLanguages.add("Go");
		programmingLanguages.add("PHP");

		System.out.println(programmingLanguages);

		System.out.print("\nBy forEach: ");
		for (String language : programmingLanguages) {
			System.out.print(language + ", ");
		}

		System.out.print("\nBy Iterator: ");
		Iterator<String> itr = programmingLanguages.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}

		System.out.print("\nBy Java 8 forEachRemaining: ");
		programmingLanguages.iterator().forEachRemaining(language -> System.out.print(language + ", "));

		System.out.print("\nBy forEach and lambda expression: ");
		programmingLanguages.forEach(element -> System.out.print(element + ", "));
	}
}
