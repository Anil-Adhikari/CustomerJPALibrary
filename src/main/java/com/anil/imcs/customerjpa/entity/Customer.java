package com.anil.imcs.customerjpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="customers", indexes= {@Index(name="name_index", columnList="customer_name", unique=false)})

@Getter
@Setter
@ToString
public class Customer extends Person {
	@Id
	@Column(name="customer_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer custID;
	
	@Column(name="customer_name", nullable=false)
	private String customerName;
	
	@Column(name="credit_limit")
	private Double creditLimit;
	
	@Column(name="salesrep_id")
	private Integer salesRepID;
	
	@Column(name="phone_number", nullable=false)
	private String phoneNumber;
	
	/*@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")*/
	@Embedded
	private Address address;

	@OneToMany(mappedBy="customer", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Order> orders;
	
	@OneToMany(mappedBy="customer", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<Payments> payments;
	
	//Constructors
	public Customer() {
		
	}
	
	public Customer(Integer custID, String name) {
		this.custID = custID;
		this.customerName = name;
	}
	
	public Customer(Integer custID, String name, Double creditLimit) {
		this.custID = custID;
		this.customerName = name;
		this.creditLimit = creditLimit;
	}
	
	public Customer(Integer custID, String name, Double creditLimit, String phoneNumber) {
		this.custID = custID;
		this.customerName = name;
		this.creditLimit = creditLimit;
		this.phoneNumber = phoneNumber;
	}

	public Customer(Integer custID, String customerName, Double creditLimit, Integer salesRepID, String phoneNumber) {
		super();
		this.custID = custID;
		this.customerName = customerName;
		this.creditLimit = creditLimit;
		this.salesRepID = salesRepID;
		this.phoneNumber = phoneNumber;
	}

	public Customer(int custID, String customerName, Double creditLimit, Integer salesRepID, String phoneNumber, Address address) {
		super();
		this.custID = custID;
		this.customerName = customerName;
		this.creditLimit = creditLimit;
		this.salesRepID = salesRepID;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}



	public Customer(int i) {
		this.custID = i;
	}

	public void doSomethingA() {
		System.out.println("Doing something .. A");
	}

	public void doSomethingB() {
		System.out.println("Doing something .. B");
	}
	
	public boolean hasCredit() {
		return creditLimit > 0;
	}
	//Some customer related methods
	
}
