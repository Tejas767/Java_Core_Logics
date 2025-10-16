package com.corejava.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayList {
    public static void main(String[] args) {

        List<String> programmingLanguages = new ArrayList<String>();
        programmingLanguages.add("Java");
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("Go");
        programmingLanguages.add("PHP");
        System.out.println(programmingLanguages);

        // remove(index) removes element at given index
        String removed = programmingLanguages.remove(5);
        System.out.println("Removed element at index 5: " + removed);
        System.out.println(programmingLanguages);

        // remove(object) removes specified element
        Boolean isRemoved = programmingLanguages.remove("PHP");
        System.out.println(isRemoved);
        System.out.println(programmingLanguages);

        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("JavaScript");
        scriptingLanguages.add("PHP");
        scriptingLanguages.add("Ruby");

        // removeAll(collection) removes all elements present in the collection
        Boolean isRemovedAll = programmingLanguages.removeAll(scriptingLanguages);
        System.out.println(isRemovedAll);
        System.out.println(programmingLanguages);

        // removeIf(predicate) removes elements matching the condition
        programmingLanguages.removeIf(element -> element.startsWith("C"));
        System.out.println(programmingLanguages);

        // clear() removes all elements from the list
        programmingLanguages.clear();
        System.out.println(programmingLanguages);
    }
}
