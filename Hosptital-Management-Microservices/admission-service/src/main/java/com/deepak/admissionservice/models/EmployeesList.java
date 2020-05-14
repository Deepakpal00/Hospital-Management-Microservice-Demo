package com.deepak.admissionservice.models;

import java.util.List;

public class EmployeesList {
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public List<Employee> employees;

}
