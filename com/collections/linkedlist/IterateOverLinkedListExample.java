package com.corejava.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterateOverLinkedListExample {
	public static void main(String[] args) {

		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Apple"); // 0
		fruits.add("Banana"); // 1
		fruits.add("Cherry"); // 2
		fruits.add("Mango"); // 3
		fruits.add("Orange"); // 4
		fruits.add("Orange"); // 5
		fruits.add("Grapes"); // 6

		System.out.println(fruits);

		System.out.print("\nBy forEach loop: ");
		for (String listOfFruits : fruits) {
			System.out.print(listOfFruits + ", ");
		}

		System.out.print("\nBy Iterator: ");
		Iterator<String> itr = fruits.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}

		System.out.print("\nBy Iterator in reverse: ");
		Iterator<String> itrRev = fruits.descendingIterator();
		while (itrRev.hasNext()) {
			System.out.print(itrRev.next() + ", ");
		}

		System.out.print("\nBy Java 8 forEach Remaining: ");
		fruits.iterator().forEachRemaining(fruit -> System.out.print(fruit + ", "));

		System.out.print("\nBy forEach and lambda expression: ");
		fruits.forEach(fruit -> System.out.print(fruit + ", "));
	}
}
