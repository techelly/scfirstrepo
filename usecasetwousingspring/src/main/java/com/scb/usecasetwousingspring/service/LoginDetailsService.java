package com.scb.usecasetwousingspring.service;

import com.scb.usecasetwousingspring.entity.LoginDetails;

public interface LoginDetailsService {
	//CREATE
	public LoginDetails login(LoginDetails loginDetails);
	//Retrieve
	public LoginDetails getLoginDetails(String emailId);
}
