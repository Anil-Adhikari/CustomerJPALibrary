package com.anil.imcs.customerjpa.dao;

import com.anil.imcs.customerjpa.entity.Order;

public interface OrderDAO {

	boolean addOrder(Order order);
	Order readOrder(Integer id);
	boolean deleteOrder(Integer id);
	boolean updateOrder(Order sourceOrder);
}
