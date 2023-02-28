package org.generation.app.service;

import java.util.List;

import org.generation.app.model.Customer;

public interface iCustomerService {
	
	public List<Customer> getAllCustomers();
	
	public List<Customer> getAllActiveCustomers();
 }
