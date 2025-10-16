package com.corejava.collections.treeset;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        SortedSet<String> fruits = new TreeSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println(fruits);

        // Duplicate ignored
        fruits.add("Banana");

        // Case-sensitive
        fruits.add("banana");
        System.out.println(fruits);

        // Case-insensitive TreeSet
        SortedSet<String> inSensitiveFruits = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        inSensitiveFruits.add("Banana");
        inSensitiveFruits.add("banana"); 
        System.out.println(inSensitiveFruits);

        // Reverse order 
        SortedSet<String> descendingFruits = new TreeSet<>(Comparator.reverseOrder());
        descendingFruits.add("Apple");
        descendingFruits.add("Banana");
        descendingFruits.add("Cherry");
        descendingFruits.add("Mango");
        descendingFruits.add("Orange");
        System.out.println(descendingFruits);
    }
}
