package com.scb.usecasetwousingspring.service;

import java.util.List;
import java.util.Map;

import com.scb.usecasetwousingspring.entity.Employee;

public interface EmployeeService {

	// get all employees
	public List<Employee> getAllEmployees();

	// create employee rest api
	public Employee createEmployee(Employee employee);
	// get employee by id rest api

	public Employee getEmployeeById(Long id);

	// update employee
	public Employee updateEmployee(Long id, Employee employeeDetails);
	// delete employee rest api

	public Map<String, Boolean> deleteEmployee(Long id);
}
