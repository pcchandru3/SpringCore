package com.learn.java.spring.core.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.learn.java.spring.core.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUserName}")
	private String dbUserName;
	
	/* (non-Javadoc)
	 * @see com.learn.java.spring.core.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		
		System.out.println(dbUserName);
		
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstname("Chala");
		customer.setLastname("Panagala");
		
		customers.add(customer);
		
		return customers;
	}

}
