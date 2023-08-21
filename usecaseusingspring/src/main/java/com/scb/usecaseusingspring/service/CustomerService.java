package com.scb.usecaseusingspring.service;

import java.util.List;

import com.scb.usecaseusingspring.entity.Customer;

public interface CustomerService {
	// Create
	public Customer addCustomer(Customer customer);

	// Retrieve
	public Customer getCustomer(Integer customerId);

	// Update
	public String updateCustomer(Customer customer);

	// Delete
	public void deleteCustomer(Integer customerId);

	// Retrieve all customers
	public List<Customer> getAllCustomers();

}
