package com.scb.usecaseusingspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.usecaseusingspring.dao.CustomerDAO;
import com.scb.usecaseusingspring.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO customerDAO;
	@Override
	public Customer addCustomer(Customer customer) {
		
		return customerDAO.save(customer);
	}

	@Override
	public Customer getCustomer(Integer customerId) {
		Optional<Customer> cust= customerDAO.findById(customerId);
		if(cust.isPresent()) {
			return cust.get();
		}else {
			return null; //ideally we should throw an exception CustomerNotFoundException
			
		}
	}

	@Override
	public String updateCustomer(Customer customer) {
		Customer cust = getCustomer(customer.getCustomerId());
		if(cust != null) {
			customerDAO.save(customer);
			return "Updated Successfully" ;
		}else {
			return "Customer with id "+customer.getCustomerId()+" doesn't exists";
		}
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		customerDAO.deleteById(customerId);
	}

	@Override
	public List<Customer> getAllCustomers() {
			
		return (List<Customer>) customerDAO.findAll();
	}

}
