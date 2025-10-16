package com.corejava.collections.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveElementsFromHashset {
	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		System.out.println(numbers);

		numbers.remove(3);
		System.out.println(numbers);

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);

		numbers.removeAll(list);
		System.out.println(numbers);

		numbers.removeIf(num -> num % 2 == 0);
		System.out.println(numbers);

		numbers.clear();
		System.out.println(numbers);
	}
}
