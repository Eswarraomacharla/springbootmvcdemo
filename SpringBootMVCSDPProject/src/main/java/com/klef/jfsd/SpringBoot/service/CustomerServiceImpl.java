package com.klef.jfsd.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.SpringBoot.model.Customer;
import com.klef.jfsd.SpringBoot.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public String CustomerRegistration(Customer customer) {
		customerRepository.save(customer);
		return "Customer Registered Successfully";
	}

	@Override
	public Customer checkCustomerLogin(String email, String password) 
	{
		return customerRepository.checkCustomerLogin(email, password);
	}

}
