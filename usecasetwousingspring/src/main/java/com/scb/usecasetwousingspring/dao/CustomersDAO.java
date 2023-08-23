package com.scb.usecasetwousingspring.dao;

import org.springframework.data.repository.CrudRepository;

import com.scb.usecasetwousingspring.entity.Customers;

public interface CustomersDAO extends CrudRepository<Customers, Integer> {

}
