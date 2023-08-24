package com.scb.usecasetwousingspring.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.usecasetwousingspring.dao.EmployeeRepository;
import com.scb.usecasetwousingspring.entity.Employee;
import com.scb.usecasetwousingspring.exceptions.ResourceNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	// get all employees
	public List<Employee> getAllEmployees(){
		return (List<Employee>) employeeRepository.findAll();
	}		
	
	// create employee rest api
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	// get employee by id rest api
	
	public Employee getEmployeeById(Long id) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		return employee;
	}
	
	// update employee rest api
	
	public Employee updateEmployee(Long id, Employee employeeDetails){
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmailId(employeeDetails.getEmailId());
		
		Employee updatedEmployee = employeeRepository.save(employee);
		return updatedEmployee;
	}
	
	// delete employee rest api
	
	public Map<String, Boolean> deleteEmployee(Long id){
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		employeeRepository.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
	
}
