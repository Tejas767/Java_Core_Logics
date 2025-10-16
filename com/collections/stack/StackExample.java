package com.corejava.collections.stack;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		stack.add(6);
		stack.add(7);
		stack.add(8);
		stack.add(9);
		stack.add(10);

		// look at the top element without removing it
		Integer topElement = stack.peek();
		System.out.println(topElement);

		// remove and return the top element
		Integer poppedElement = stack.pop();
		System.out.println(poppedElement);

		// find the position of 10 from the top (returns -1 if not found)
		System.out.println(stack.search(10));

		// check if the stack is empty
		System.out.println(stack.isEmpty());

		// get how many elements are in the stack
		System.out.println(stack.size());

		// check if stack has the number 10
		System.out.println(stack.contains(10));

		// remove everything from the stack
		stack.clear();
		System.out.println(stack);
	}
}
