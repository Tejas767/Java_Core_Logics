package com.corejava.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class RemoveElementsExample {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");

		// removes the first element
		list.removeFirst();
		System.out.println(list);

		// removes the last element ("Cherry")
		list.removeLast();
		System.out.println(list);

		list.add("Orange");
		list.add("Orange"); // added duplicate element
		System.out.println(list);

		// removes the first occurrence of "Orange"
		list.remove("Orange");
		System.out.println(list);

		// removes all elements starting with "C"
		list.removeIf(element -> element.startsWith("C"));
		System.out.println(list);

		// removes all elements from the list
		list.clear();
		System.out.println(list);
	}
}
