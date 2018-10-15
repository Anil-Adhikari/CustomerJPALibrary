package com.anil.imcs.customerjpa.dao;

import javax.persistence.EntityManager;

import com.anil.imcs.customerjpa.entity.Customer;
import com.anil.imcs.customerjpa.util.JPAPersistenceUtil;

public class CustomerDAOImpl implements CustomerDAO{

	public boolean addCustomer(Customer customer) {
		EntityManager manager = getEntityManager();
		try{
			manager.getTransaction().begin();
			manager.persist(customer);
			manager.getTransaction().commit();
		}finally {
			manager.close();
		}
		return true;
	}

	public boolean deleteCustomer(Integer customerId) {
		EntityManager manager = getEntityManager();
		try{
			manager.getTransaction().begin();
			Customer customer = manager.find(Customer.class, customerId);
			manager.remove(customer);;
			manager.getTransaction().commit();
		}finally {
			manager.close();
		}
		return true;
	}

	public boolean updateCustomer(Customer sourceCustomer) {
		EntityManager manager = getEntityManager();
		try{
			manager.getTransaction().begin();
			manager.merge(sourceCustomer);;
			manager.getTransaction().commit();
		}finally {
			manager.close();
		}
		return true;
	}

	public Customer readCustomer(Integer customerId) {
		EntityManager manager = getEntityManager();
		Customer customer = null;
		try{
			manager.getTransaction().begin();
			customer = manager.find(Customer.class, customerId);
			manager.getTransaction().commit();
		}finally {
			manager.close();
		}
		return customer;
	}
	
	private EntityManager getEntityManager() {
		return JPAPersistenceUtil.getEntityManagerFactory().createEntityManager();
	}

}
