package com.scb.usecasetwousingspring.dao;

import org.springframework.data.repository.CrudRepository;

import com.scb.usecasetwousingspring.entity.Accounts;

public interface AccountsDAO extends CrudRepository<Accounts,Integer> {

}
