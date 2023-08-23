package com.scb.usecasetwousingspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scb.usecasetwousingspring.entity.Accounts;
import com.scb.usecasetwousingspring.exceptions.AccountsNotFoundException;
import com.scb.usecasetwousingspring.service.AccountsService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/accounts")
@Tag(name = "Accounts API",description="APIs for Accounts")
public class AccountsController {
	
	@Autowired
	private AccountsService accountsService;
	
	//http://localhost:9091/api/accounts/getaccountsbyid?accid=1
	//@GetMapping("/api/accounts/getaccountsbyid")
	
	@GetMapping("/getaccountsbyid")
	public Accounts getAccountsById(@RequestParam("accid") Integer id) throws AccountsNotFoundException {
		return accountsService.getAccountsById(id);
	}
	
	//Update
	@PostMapping("/updateaccounts")
	public Accounts updateAccounts(@RequestBody Accounts accounts) throws AccountsNotFoundException {
		return accountsService.updateAccounts(accounts);
	}
	
	//Delete
	@GetMapping("/deleteaccounts")
	public String deleteAccounts(@RequestParam("accid") Integer id) throws AccountsNotFoundException {
		accountsService.deleteAccountsById(id);
		return "Deleted Successfully";
	}
	
	@PostMapping("/accounts")
	public Accounts addAccounts(@RequestBody Accounts accounts) {
		return accountsService.addAccounts(accounts);
	}
	
	
}
