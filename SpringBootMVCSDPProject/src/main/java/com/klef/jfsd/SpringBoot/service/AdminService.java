package com.klef.jfsd.SpringBoot.service;

import java.util.List;

import com.klef.jfsd.SpringBoot.model.Admin;
import com.klef.jfsd.SpringBoot.model.Customer;

public interface AdminService {

	public List<Customer> viewAllCustomers();
	public Admin checkAdminLogin(String uname,String pwd);
	public long customercount();
	
}
