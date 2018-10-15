package com.anil.imcs.customerjpa.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="orders")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="order_id")
	private Integer orderID;
	
	@Column(name="order_date")
	private LocalDate orderDate;
	
	@Column(name="required_date")
	@Temporal(TemporalType.DATE)
	private Date requiredDate;
	
	@Column(name="shipping_date")
	@Temporal(TemporalType.DATE)
	private Date shippingDate;
	
	@Column(name="status")
	private String status; //enum ?
	
	@Column(name="comments")
	private String comments;
	
	@OneToMany(mappedBy="order", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<ProductLineItem> products;
	
	@ManyToOne
	@JoinColumn(name="customer_id", nullable=false)
	private Customer customer;
	
	public Order(int i) {
		this.orderID = i;
	}
}
