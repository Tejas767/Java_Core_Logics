package com.corejava.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFromCollections {
	public static void main(String[] args) {

		List<Integer> listOne = new ArrayList<Integer>();
		listOne.add(1);
		listOne.add(2);
		listOne.add(3);
		listOne.add(4);
		listOne.add(5);

		List<Integer> listTwo = new ArrayList<Integer>();
		listTwo.add(6);
		listTwo.add(7);
		listTwo.add(8);
		listTwo.add(9);
		listTwo.add(10);

		// Creating listThree from listOne.
		List<Integer> listThree = new ArrayList<Integer>(listOne);

		// Adding all elements using addAll method.
		listThree.addAll(listTwo);

		System.out.println(listThree);
	}
}
