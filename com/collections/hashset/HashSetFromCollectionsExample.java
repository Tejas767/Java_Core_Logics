package com.corejava.collections.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetFromCollectionsExample {
	public static void main(String[] args) {

		List<Integer> listOne = new ArrayList<Integer>();
		listOne.add(1);
		listOne.add(2);
		listOne.add(2);
		listOne.add(3);
		listOne.add(4);
		listOne.add(4);
		listOne.add(5);

		List<Integer> listTwo = new ArrayList<Integer>();
		listTwo.add(6);
		listTwo.add(7);
		listTwo.add(7);
		listTwo.add(8);
		listTwo.add(9);
		listTwo.add(9);
		listTwo.add(10);

		// HashSet removes duplicate elements from listOne
		Set<Integer> set = new HashSet<>(listOne);
		System.out.println(set);

		// add all elements and HashSet removes duplicate elements from listTwo
		set.addAll(listTwo);
		System.out.println(set);
	}
}
