package com.corejava.collections.hashset;

import java.util.HashSet;
import java.util.Set;

class Employee {
	private int id;
	private String firstName;
	private String lastName;

	public Employee() {
		super();
	}

	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}

public class UserDefinedHashSetExample {
	public static void main(String[] args) {
		Set<String> programmingLanguages = new HashSet<String>();
		programmingLanguages.add("Java");
		programmingLanguages.add("C");
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Python");
		programmingLanguages.add("Python");
		programmingLanguages.add("JavaScript");
		programmingLanguages.add("Go");
		programmingLanguages.add("Go");
		programmingLanguages.add("PHP");

		for (String language : programmingLanguages) {
			System.out.print(language + ", ");
		}
	}
}
