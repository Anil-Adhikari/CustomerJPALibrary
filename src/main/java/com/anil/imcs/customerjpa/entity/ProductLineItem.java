package com.anil.imcs.customerjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="productlineitem", indexes= {
		@Index(name = "product_code_index", columnList="product_code", unique=false)})
@Getter
@Setter
public class ProductLineItem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="product_line_id")
	private int productLineId;
	
	@ManyToOne
	@JoinColumn(name="order_number")
	private Order order;
	
	@Column(name="product_code")
	private int productCode;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="product_desc")
	private String productDescription;
	
	@Column(name="quantity_ordered")
	private int quantityOrdered;
	
	@Column(name="price_each")
	private double priceEach;
	
}
