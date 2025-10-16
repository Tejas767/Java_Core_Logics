package com.corejava.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArrayListExample {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(40);

		Collections.sort(list);
		System.out.println(list);

		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

		list.sort(Comparator.naturalOrder());
		System.out.println(list);
	}
}
