package com.corejava.collections.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {

		Map<String, String> fileExtensions = new TreeMap<String, String>();
		fileExtensions.put("Java", "java");
		fileExtensions.put("Python", "py");
		fileExtensions.put("C", "c");
		fileExtensions.put("C++", "cpp");
		fileExtensions.put("JavaScript", "js");
		fileExtensions.put("HTML", "html");
		fileExtensions.put("CSS", "css");
		fileExtensions.put("XML", "xml");
		fileExtensions.put("Kotlin", "kt");
		fileExtensions.put("Go", "go");
		System.out.println("In natural order");
		System.out.println(fileExtensions);

		Map<String, String> printExReverse = new TreeMap<String, String>(Comparator.reverseOrder());
		printExReverse.put("Java", "java");
		printExReverse.put("Python", "py");
		printExReverse.put("C", "c");
		printExReverse.put("C++", "cpp");
		printExReverse.put("JavaScript", "js");
		printExReverse.put("HTML", "html");
		printExReverse.put("CSS", "css");
		printExReverse.put("XML", "xml");
		printExReverse.put("XML", "xml");
		printExReverse.put("Kotlin", "kt");
		printExReverse.put("Go", "go");
		System.out.println("In reverse order");
		System.out.println(printExReverse);
		

	}
}
