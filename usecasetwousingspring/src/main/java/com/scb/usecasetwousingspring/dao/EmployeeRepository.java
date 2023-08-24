package com.scb.usecasetwousingspring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.scb.usecasetwousingspring.entity.Employee;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee, Long> {

}


	