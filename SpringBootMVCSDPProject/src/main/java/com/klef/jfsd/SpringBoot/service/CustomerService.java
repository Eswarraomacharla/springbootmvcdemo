package com.klef.jfsd.SpringBoot.service;

import com.klef.jfsd.SpringBoot.model.Customer;

public interface CustomerService 
{
	
	public String CustomerRegistration(Customer customer);
	public Customer checkCustomerLogin(String email,String password);
}
