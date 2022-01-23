package com.example.crm.application.business.exception;

public class CustomerAlreadyExistException extends RuntimeException {

	public CustomerAlreadyExistException() {
		super("Customer already exists.");
	}

}
