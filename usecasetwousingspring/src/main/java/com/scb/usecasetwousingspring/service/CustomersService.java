package com.scb.usecasetwousingspring.service;

import java.util.List;

import com.scb.usecasetwousingspring.entity.Accounts;
import com.scb.usecasetwousingspring.entity.Customers;
import com.scb.usecasetwousingspring.exceptions.AccountsNotFoundException;
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
		
		public List<Accounts> getAllAccountsByCustomerId(Integer custId) throws CustomersNotFoundException,AccountsNotFoundException;
}
