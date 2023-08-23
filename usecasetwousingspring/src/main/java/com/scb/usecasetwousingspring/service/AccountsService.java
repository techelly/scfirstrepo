package com.scb.usecasetwousingspring.service;

import com.scb.usecasetwousingspring.entity.Accounts;
import com.scb.usecasetwousingspring.exceptions.AccountsNotFoundException;

public interface AccountsService {
	// Create
	public Accounts addAccounts(Accounts customers);

	// Retrieve
	public Accounts getAccountsById(Integer custId) throws AccountsNotFoundException;

	// Update
	public Accounts updateAccounts(Accounts accounts) throws AccountsNotFoundException;

	// Delete
	public void deleteAccountsById(Integer custId) throws AccountsNotFoundException;
}
