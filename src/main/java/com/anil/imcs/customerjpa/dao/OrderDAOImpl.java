package com.anil.imcs.customerjpa.dao;

import javax.persistence.EntityManager;

import com.anil.imcs.customerjpa.entity.Order;
import com.anil.imcs.customerjpa.util.JPAPersistenceUtil;

public class OrderDAOImpl implements OrderDAO{

	public boolean addOrder(Order order) {
		EntityManager manager = getEntityManager();
		try{
			manager.getTransaction().begin();
			manager.persist(order);
			manager.getTransaction().commit();
		}finally {
			manager.close();
		}
		return true;
	}

	public Order readOrder(Integer id) {
		EntityManager manager = getEntityManager();
		Order order = null;
		try{
			manager.getTransaction().begin();
			order = manager.find(Order.class, id);
			manager.getTransaction().commit();
		}finally {
			manager.close();
		}
		return order;
	}

	public boolean deleteOrder(Integer id) {
		EntityManager manager = getEntityManager();
		try{
			manager.getTransaction().begin();
			Order order = manager.find(Order.class, id);
			manager.remove(order);
			manager.getTransaction().commit();
		}finally {
			manager.close();
		}
		return true;
	}

	public boolean updateOrder(Order sourceOrder) {
		EntityManager manager = getEntityManager();
		try{
			manager.getTransaction().begin();
			manager.merge(sourceOrder);
			manager.getTransaction().commit();
		}finally {
			manager.close();
		}
		return true;
	}
	
	private EntityManager getEntityManager() {
		return JPAPersistenceUtil.getEntityManagerFactory().createEntityManager();
	}

}
