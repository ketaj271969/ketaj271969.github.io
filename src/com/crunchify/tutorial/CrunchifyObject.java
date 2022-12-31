package com.crunchify.tutorial;

import java.util.List;

/**
 * @author Crunchify.com This is simple CrunchifyObject POJO contains another
 *         class "Employee" as a field
 *         http://crunchify.com/complete-end-to-end-java-tutorial-with-singleton-object-employee-crunchify-object-pojo-detailed-testcase/
 */

public class CrunchifyObject {
	public String name;
	public String address;
	public List<Employee> employees;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	// Class Employee
	public class Employee {
		public String firstName;
		public String lastName;
		public int phoneNumber;

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

		public int getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
	}
}
