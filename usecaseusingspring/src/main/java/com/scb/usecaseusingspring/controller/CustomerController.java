package com.scb.usecaseusingspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scb.usecaseusingspring.entity.Customer;
import com.scb.usecaseusingspring.service.CustomerService;

@RestController
public class CustomerController {
		
		@Autowired
		private CustomerService customerService;
		
		//http://localhost:8080/addcustomer
		// Create
		@PostMapping("/addcustomer")
		public Customer addCustomer(@RequestBody Customer customer) {
			
			return customerService.addCustomer(customer);
		}

		// Retrieve
		//http://localhost:8080/getcustomer?id=1
		@GetMapping("/getcustomer")
		public Customer getCustomer(@RequestParam ("id")Integer customerId) {
			
			return customerService.getCustomer(customerId);
		}

		// Update
		@PostMapping("/updatecustomer")
		public String updateCustomer(@RequestBody Customer customer) {
				customerService.updateCustomer(customer);
			return "Update successfully";
		}

		// Delete
		@DeleteMapping("/deletecustomer")
		public void deleteCustomer(@RequestParam("id")Integer customerId) {
			customerService.deleteCustomer(customerId);
		}

		// Retrieve all customers
		public List<Customer> getAllCustomers(){
			return customerService.getAllCustomers();
		}
	
}
