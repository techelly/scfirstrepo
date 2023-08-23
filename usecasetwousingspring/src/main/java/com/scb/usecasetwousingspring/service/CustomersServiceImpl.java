package com.scb.usecasetwousingspring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.usecasetwousingspring.dao.CustomersDAO;
import com.scb.usecasetwousingspring.entity.Customers;
import com.scb.usecasetwousingspring.exceptions.CustomersNotFoundException;

@Service
public class CustomersServiceImpl implements CustomersService {
	
	@Autowired
	private CustomersDAO customersDAO;	
	
	@Override
	public Customers addCustomers(Customers customers) {
		
		return customersDAO.save(customers);
	}

	@Override
	public Customers getCustomersById(Integer custId) throws CustomersNotFoundException {
		Optional<Customers> customers = customersDAO.findById(custId);
		if(customers.isPresent()) {
			return customers.get();
		}else {
			throw new CustomersNotFoundException("Customers with id "+custId+" not found");
		}
	}

	@Override
	public Customers updateCustomers(Customers customers) throws CustomersNotFoundException {
		Optional<Customers> custs = customersDAO.findById(customers.getCustId());
		if(custs.isPresent()) {
			return customersDAO.save(customers);
		}else {
			throw new CustomersNotFoundException("Customers with id "+customers.getCustId()+" not found , so unable to update");
		}

	}

	@Override
	public void deleteCustomerById(Integer custId) throws CustomersNotFoundException {
		Optional<Customers> customers = customersDAO.findById(custId);
		if(customers.isPresent()) {
			customersDAO.deleteById(custId);
		}else {
			throw new CustomersNotFoundException("Customers with id "+custId+" not found , cannot delete the customers");
		}

	}

}
