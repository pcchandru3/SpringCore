package com.learn.java.spring.core.service;

import java.util.List;

import com.learn.java.spring.core.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

}