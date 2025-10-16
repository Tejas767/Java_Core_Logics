package com.corejava.collections.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class AccessElementTreeSetExample {
    public static void main(String[] args) {

        NavigableSet<String> fruits = new TreeSet<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println(fruits);

        // size() → returns number of elements in the set
        System.out.println("Number of elements in set: " + fruits.size());

        // contains(Object o) → checks if the set contains a given element
        System.out.println("Does set contain 'Banana'? " + fruits.contains("Banana"));

        System.out.println("Does set contain 'Watermelon'? " + fruits.contains("Watermelon"));

        // first() → returns the lowest (first) element
        System.out.println("First element in set: " + fruits.first());

        // last() → returns the highest (last) element
        System.out.println("Last element in set: " + fruits.last());

        // higher(E e) → returns the least element strictly greater than the given element
        System.out.println("Element higher than 'Banana': " + fruits.higher("Banana"));

        // lower(E e) → returns the greatest element strictly less than the given element
        System.out.println("Element lower than 'Banana': " + fruits.lower("Banana"));
    }
}
