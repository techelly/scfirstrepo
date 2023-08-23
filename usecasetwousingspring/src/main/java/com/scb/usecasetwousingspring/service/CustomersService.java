package com.scb.usecasetwousingspring.service;

import com.scb.usecasetwousingspring.entity.Customers;
import com.scb.usecasetwousingspring.exceptions.CustomersNotFoundException;

public interface CustomersService {
		//Create
		public Customers addCustomers(Customers customers);
		//Retrieve
		public Customers getCustomersById(Integer custId) throws CustomersNotFoundException;
		//Update
		public Customers updateCustomers(Customers customers) throws CustomersNotFoundException;
		//Delete
		public void deleteCustomerById(Integer custId) throws CustomersNotFoundException;
}
