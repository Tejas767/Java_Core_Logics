package com.corejava.collections.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

class Employee {
	private int id;
	private String name;
	private String email;
	private String department;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String email, String department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return " Employee id = " + id + ", name = " + name + ", email = " + email + ", department = " + department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, email, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name);
	}

}

public class UserDefinedLinkedHashMap {
	public static void main(String[] args) {
		Map<Integer, Employee> employee = new LinkedHashMap<Integer, Employee>();
		employee.put(1, new Employee(1, "varad", "varad@123", "it"));
		System.out.println(employee);
	}
}
