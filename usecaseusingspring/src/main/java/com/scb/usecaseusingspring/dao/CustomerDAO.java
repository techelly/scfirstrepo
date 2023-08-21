package com.scb.usecaseusingspring.dao;

import org.springframework.data.repository.CrudRepository;

import com.scb.usecaseusingspring.entity.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Integer> {
		public Customer findByName(String customerName);
}
