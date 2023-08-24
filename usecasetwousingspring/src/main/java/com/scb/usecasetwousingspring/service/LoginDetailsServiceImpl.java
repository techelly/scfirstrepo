package com.scb.usecasetwousingspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.usecasetwousingspring.dao.LoginDetailsRepository;
import com.scb.usecasetwousingspring.entity.LoginDetails;

@Service
public class LoginDetailsServiceImpl implements LoginDetailsService {
	
	@Autowired
	LoginDetailsRepository loginRepo;
	
	@Override
	public LoginDetails login(LoginDetails loginDetails) {
		
		return loginRepo.save(loginDetails);
	}

	@Override
	public LoginDetails getLoginDetails(String emailId) {
		
		return loginRepo.findByEmail(emailId);
	}

}
