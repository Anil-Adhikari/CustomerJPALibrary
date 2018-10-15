package com.anil.imcs.customerjpa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="payments")

@Getter
@Setter
public class Payments {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="payment_id")
	private int paymentId;
	
	@Column(name="check_no")
	private int checkNo;
	
	@Column(name="payment_date")
	private Date paymentDate;
	
	@Column(name="amount")
	private double amount;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	//Constructor
	
	//Payment related methods.
}
