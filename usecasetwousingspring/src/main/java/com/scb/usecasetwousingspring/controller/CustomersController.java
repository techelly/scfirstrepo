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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/customers")
@Tag(name = "Customers API",description="APIs for Customers")
public class CustomersController {
	//http://localhost:9091/api/customers/getcustomersbyid?id=1
	
	@Autowired
	private CustomersService customersService;
	
	//http://localhost:9091/api/customers/getcustomersbyid?accid=1
	//@GetMapping("/api/customers/getcustomersbyid")
	
	@Operation(summary = "Get a customers by id", description = "Returns a customer as per the id")
	@ApiResponses(value = {
	        @ApiResponse(responseCode = "200", description = "Successfully retrieved"), 
	        @ApiResponse(responseCode = "404", description = "Not found - The Customers was not found")
	    })
	@GetMapping("/getcustomersbyid")
	public Customers getCustomersById(@RequestParam("custid") Integer id) throws CustomersNotFoundException {
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
