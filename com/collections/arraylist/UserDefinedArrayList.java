package com.corejava.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

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

public class UserDefinedArrayList {
	public static void main(String[] args) {

		List<Employee> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(new Employee(1, "John", "Doe"));
		listOfEmployees.add(new Employee(2, "Alice", "Smith"));
		listOfEmployees.add(new Employee(3, "Bob", "Johnson"));
		listOfEmployees.add(new Employee(4, "Emma", "Williams"));
		listOfEmployees.add(new Employee(5, "David", "Brown"));

		listOfEmployees.forEach(emp -> System.out.println(emp));
	}
}
