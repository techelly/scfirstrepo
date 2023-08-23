package com.scb.usecasetwousingspring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.usecasetwousingspring.dao.AccountsDAO;
import com.scb.usecasetwousingspring.entity.Accounts;
import com.scb.usecasetwousingspring.exceptions.AccountsNotFoundException;

@Service
public class AccountsServiceImpl implements AccountsService {
	
	@Autowired
	private AccountsDAO accountsDAO;	
	
	@Override
	public Accounts addAccounts(Accounts accounts) {
		
		return accountsDAO.save(accounts);
	}

	@Override
	public Accounts getAccountsById(Integer id) throws AccountsNotFoundException {
		Optional<Accounts> accounts = accountsDAO.findById(id);
		if(accounts.isPresent()) {
			return accounts.get();
		}else {
			throw new AccountsNotFoundException("Accounts with id "+id+" not found");
		}
	}

	@Override
	public Accounts updateAccounts(Accounts accounts) throws AccountsNotFoundException {
		Optional<Accounts> acc = accountsDAO.findById(accounts.getId());
		if(acc.isPresent()) {
			return accountsDAO.save(accounts);
		}else {
			throw new AccountsNotFoundException("Accounts with id "+accounts.getId()+" not found , so unable to update");
		}

	}

	@Override
	public void deleteAccountsById(Integer id) throws AccountsNotFoundException {
		Optional<Accounts> accounts = accountsDAO.findById(id);
		if(accounts.isPresent()) {
			accountsDAO.deleteById(id);
		}else {
			throw new AccountsNotFoundException("Accounts with id "+id+" not found , cannot delete the accounts");
		}

	}

}
