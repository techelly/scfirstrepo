package com.scb.usecasetwousingspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scb.usecasetwousingspring.entity.LoginDetails;
import com.scb.usecasetwousingspring.service.LoginDetailsService;

@RestController
@CrossOrigin("*")
public class LoginDetailsController {
	
		@Autowired
		LoginDetailsService service;
		//CREATE
		@PostMapping("/login")
		public LoginDetails login(@RequestBody LoginDetails loginDetails) {
			return service.login(loginDetails);
		}
		//Retrieve
		@GetMapping("/loginDetails")
		public LoginDetails getLoginDetails(@RequestParam("emailId") String emailId) {
			return service.getLoginDetails(emailId);
		}
}
