package com.anil.imcs.customerjpa.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.anil.imcs.customerjpa.dao.CustomerDAOImpl;
import com.anil.imcs.customerjpa.dao.OrderDAO;
import com.anil.imcs.customerjpa.dao.OrderDAOImpl;
import com.anil.imcs.customerjpa.entity.Address;
import com.anil.imcs.customerjpa.entity.Customer;
import com.anil.imcs.customerjpa.entity.Order;
import com.anil.imcs.customerjpa.entity.ProductLineItem;
import com.anil.imcs.customerjpa.entity.State;
import com.anil.imcs.customerjpa.entity.ZipCode;

public class CustomerApp {
	public static void main(String[] args) {
		
		//customerCrud();
		orderCrud();
		
	}

	private static void orderCrud() {
		//addOrder();
		updateOrder();
		//getOrder();
		//deleteOrder();
		
	}

	private static void deleteOrder() {
		OrderDAO odao = new OrderDAOImpl();
		boolean flag = odao.deleteOrder(10);
		if (flag)
			System.out.println("Order deleted successfully!");
				else
			System.out.println("Order could not be deleted.");
		
	}

	private static void getOrder() {
		OrderDAO odao = new OrderDAOImpl();
		Order order = odao.readOrder(6);
		if(order != null)
			System.out.println("Order found with ID: " + order.getOrderID());
		else
			System.out.println("Order could not be found.");
	}

	private static void updateOrder() {
		Order order = new Order(14);
		order.setOrderDate(LocalDate.now());
		Customer customer = new Customer(1);
		order.setCustomer(customer);
		
		OrderDAO odao = new OrderDAOImpl();
		boolean flag = odao.updateOrder(order);
		if (flag)
		System.out.println("Order updated successfully!");
			else
		System.out.println("Order could not be updated.");
	}

	private static void addOrder() {
		OrderDAO odao = new OrderDAOImpl();
		Order order = new Order();
		Customer customer = new Customer(1);
		order.setCustomer(customer);
		
		ProductLineItem item1 = new ProductLineItem();
		item1.setOrder(order);
		ProductLineItem item2 = new ProductLineItem();
		item2.setOrder(order);
		ProductLineItem item3 = new ProductLineItem();
		item3.setOrder(order);
		List<ProductLineItem> productlist = new ArrayList<ProductLineItem>();
		productlist.add(item1);productlist.add(item2);productlist.add(item3);
		order.setProducts(productlist);
		
		boolean flag = odao.addOrder(order);
		if(flag)
			System.out.println("Order added successfully!");
		else
			System.out.println("Order could not be added.");
	}

	private static void customerCrud() {
		addCustomer();
		//deleteCustomer();
		//updateCustomer();
		//findCustomer();
		
	}

	private static void findCustomer() {
		CustomerDAOImpl customerdao = new CustomerDAOImpl();
		Customer customer = customerdao.readCustomer(1);
		if(customer != null)
			System.out.println(customer.getCustomerName());
		else
			System.out.println("Customer is not found");
		
	}

	private static void updateCustomer() {
		Customer customer = new Customer(1, "John Doe", 60000.0, "2524828606");
		CustomerDAOImpl customerdao = new CustomerDAOImpl();
		boolean flag = customerdao.updateCustomer(customer);
		if(flag)
			System.out.println("Customer updated successfully!");
		else
			System.out.println("Customer could not be updated.");
	}

	private static void deleteCustomer() {
		CustomerDAOImpl customerdao = new CustomerDAOImpl();
		boolean flag = customerdao.deleteCustomer(1);
		
		if(flag)
			System.out.println("Customer deleted successfully!");
		else
			System.out.println("Customer could not be deleted.");
		
	}

	private static void addCustomer() {
		Address address = new Address("6445 Love Dr.", null, "Irving", null, null, "USA");
		address.setState(State.TX);
		address.setPostalCode(new ZipCode("75038"));
		Customer customer = new Customer(null, "Anil Adhikari", 50000.0, 1038, "2524818608");
		customer.setAddress(address);
		customer.setFirstName("Anil");
		customer.setLastName("Adhikari");
		
		
		CustomerDAOImpl customerdao = new CustomerDAOImpl();
		boolean flag = customerdao.addCustomer(customer);
		
		if(flag)
			System.out.println("Customer added successfully!");
		else
			System.out.println("Customer could not be added.");
	}
}
