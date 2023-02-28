package org.generation.app.controller;

import java.util.List;

import org.generation.app.model.Customer;
import org.generation.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService; 
	
	@GetMapping()
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@GetMapping("active")
	public List<Customer> getAllActiveCustomers(){
		return customerService.getAllActiveCustomers();
	}
	

}
