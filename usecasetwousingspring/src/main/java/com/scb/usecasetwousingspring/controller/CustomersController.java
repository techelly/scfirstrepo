package com.scb.usecasetwousingspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scb.usecasetwousingspring.entity.Customers;
import com.scb.usecasetwousingspring.exceptions.CustomersNotFoundException;
import com.scb.usecasetwousingspring.service.CustomersService;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {
	//http://localhost:9091/api/customers/getcustomersbyid?id=1
	
	@Autowired
	private CustomersService customersService;
	
	//http://localhost:9091/api/customers/getcustomersbyid?accid=1
	//@GetMapping("/api/customers/getcustomersbyid")
	
	@GetMapping("/getcustomersbyid")
	public Customers getCustomersById(@RequestParam("accid") Integer id) throws CustomersNotFoundException {
		return customersService.getCustomersById(id);
	}
	
	//Update
	@PostMapping("/updatecustomers")
	public Customers updateCustomers(@RequestBody Customers customers) throws CustomersNotFoundException {
		return customersService.updateCustomers(customers);
	}
	
	//Delete
	@GetMapping("/deletecustomers")
	public String deleteCustomers(@RequestParam("accid") Integer id) throws CustomersNotFoundException {
		customersService.deleteCustomerById(id);
		return "Deleted Successfully";
	}
	
	@PostMapping("/customers")
	public Customers addCustomers(@RequestBody Customers customers) {
		return customersService.addCustomers(customers);
	}
}
