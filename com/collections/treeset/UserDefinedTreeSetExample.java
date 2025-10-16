package com.corejava.collections.treeset;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private String email;
	private String department;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String email, String department) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department + "]";
	}

	// Natural ordering → sort by id
	@Override
	public int compareTo(Employee other) {
		return Integer.compare(this.id, other.id);
	}
}

public class UserDefinedTreeSetExample {
	public static void main(String[] args) {

		SortedSet<Employee> employees = new TreeSet<>();
		employees.add(new Employee(3, "Alice", "alice@mail.com", "HR"));
		employees.add(new Employee(1, "Bob", "bob@mail.com", "IT"));
		employees.add(new Employee(2, "Charlie", "charlie@mail.com", "Finance"));
		employees.add(new Employee(1, "David", "david@mail.com", "IT")); // duplicate id → ignored

		System.out.println("Employees sorted by ID:");
		for (Employee emp : employees) {
			System.out.println(emp);
		}

		System.out.println();

		SortedSet<Employee> employeesSortByName = new TreeSet<>(Comparator.comparing(Employee::getName));
		employeesSortByName.addAll(employees);

		System.out.println("Employees sorted by Name:");
		for (Employee emp : employeesSortByName) {
			System.out.println(emp);
		}
	}
}
