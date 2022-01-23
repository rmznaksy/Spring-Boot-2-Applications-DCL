package com.example.crm.application.business.exception;

public class CustomerNotFoundException extends RuntimeException {

	public CustomerNotFoundException() {
		super("Cannot find the customer");

	}
	

}
