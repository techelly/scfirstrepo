package com.scb.usecasetwousingspring.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlers {
	
	@ExceptionHandler(CustomersNotFoundException.class)
	public ResponseEntity<String> handleCustomersNotFoundException() {
		return new ResponseEntity<String>("Customer not Found", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(AccountsNotFoundException.class)
	public ResponseEntity<String> handleAccountsNotFoundException() {
		return new ResponseEntity<String>("Accounts not Found", HttpStatus.NOT_FOUND);
	}
	
	//We can write another exception handler methods
}
