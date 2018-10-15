package com.anil.imcs.customerjpa.dao;

import com.anil.imcs.customerjpa.entity.Customer;

public interface CustomerDAO {
	
	boolean addCustomer(Customer customer);
	boolean deleteCustomer(Integer customerId);
	boolean updateCustomer(Customer sourceCustomer);
	Customer readCustomer(Integer customerId);
}
