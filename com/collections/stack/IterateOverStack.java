package com.corejava.collections.stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class IterateOverStack {
	public static void main(String[] args) {
		Stack<String> fruits = new Stack<>();
		fruits.push("Apple");
		fruits.push("Banana");
		fruits.push("Mango");
		fruits.push("Orange");

		// Using forEach with lambda
		System.out.println("Using forEach with lambda");
		fruits.forEach(fruit -> System.out.println(fruit));

		// Using Iterator with while loop
		System.out.println("\nUsing Iterator with while loop");
		Iterator<String> itr = fruits.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Using iterator() and forEachRemaining()
		System.out.println("\nUsing forEachRemaining()");
		fruits.iterator().forEachRemaining(fruit -> System.out.println(fruit));

		// Using ListIterator
		System.out.println("\nUsing ListIterator");
		ListIterator<String> listItr = fruits.listIterator(fruits.size());
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
	}
}
