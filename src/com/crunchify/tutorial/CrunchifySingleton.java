package com.crunchify.tutorial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import crunchify.com.tutorial.CrunchifyObject.Employee;

/**
 * @author Crunchify.com This is Singleton class used to access from any where
 *         from your project. Here we are using it from CrunchifyObjectTest.java
 *
 */
public class CrunchifySingleton {

	private List<Employee> employees = new ArrayList<Employee>();
	private static CrunchifySingleton singletonInstance = null;
	private CrunchifyObject crunchify = new CrunchifyObject();

	public static CrunchifySingleton getCrunchifySingletonInstance() {
		if (singletonInstance == null) {
			singletonInstance = new CrunchifySingleton();
		}
		return singletonInstance;
	}

	public void addEmployee(Employee employee) {
		synchronized (employees) {
			employees.add(employee);
		}
	}

	public List<Employee> getEmployee() {
		return employees;
	}

	public void addCrunchify(CrunchifyObject crunchify) {
		synchronized (crunchify) {
			this.crunchify = crunchify;
		}
	}

	public String getCrunchifyObject() {
		JSONObject obj = new JSONObject();
		obj.put("name", crunchify.getName());
		obj.put("address", crunchify.getAddress());

		JSONArray employeeJson = new JSONArray();
		for (Employee emp : employees) {

			Map<String, String> employeeData = new HashMap<String, String>();
			employeeData.put("firstName", emp.getFirstName());
			employeeData.put("lastName", emp.getLastName());
			employeeData.put("phoneNumber", emp.getPhoneNumber() + "");

			employeeJson.put(employeeData);
		}
		obj.put("employees", employeeJson);
		return obj.toString();
	}
}
