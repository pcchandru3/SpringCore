package com.learn.java.spring.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.learn.java.spring.core.model.Customer;
import com.learn.java.spring.core.repository.CustomerRepository;

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImpl implements CustomerService {

//	@Autowired
	private CustomerRepository customerRepository; 
	
	
	// xml 
//	public CustomerServiceImpl() {
//		
//		
//	}
//	
//	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		System.out.println("We are using constructor injection");
	}
	
	
	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}


		@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		System.out.println("We are using setting injection");
	}



	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	
	
}
