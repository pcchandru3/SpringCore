package com.learn.java.spring.core.repository;

import java.util.List;

import com.learn.java.spring.core.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}