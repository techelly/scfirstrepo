package com.scb.usecasetwousingspring.dao;

import org.springframework.data.repository.CrudRepository;

import com.scb.usecasetwousingspring.entity.LoginDetails;

public interface LoginDetailsRepository extends CrudRepository<LoginDetails, Integer> {
	public LoginDetails findByEmail(String emailId);
}
