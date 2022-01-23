package com.example.crm.dto.response;

import java.util.List;

import com.example.crm.document.Address;
import com.example.crm.entity.CustomerType;

public class DetailedCustomerResponse {
	private String identity;
	private String fullname;
	private String email;
	private String phone;
	private int birthYear;
	private String photo;
	private CustomerType type;
	private List<Address> addresses;

	
}
