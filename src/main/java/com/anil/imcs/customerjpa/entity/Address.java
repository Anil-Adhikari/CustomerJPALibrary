package com.anil.imcs.customerjpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@Entity
@Table(name="address")*/

@Embeddable

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Address {
	
	/*@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="address_id")
	Integer addressId;*/
	
	@Column(name="addressline1")
	String addressLine1;
	
	@Column(name="addressline2")
	String addressLine2;
	
	@Column(name="city")
	String city;
	
	@Enumerated(EnumType.STRING)
	@Column(name="state", length=2)
	State state; // See enum State
	
	/*@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="zip_code")*/
	@Embedded
	ZipCode postalCode; // See class zipcode
	
	@Column(name="country")
	String country;

	
	public Address(Integer id, String addressLine1, String addressLine2, String city, String stateName, String postalCode,
			String country) {
		super();
		//this.addressId = id;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = State.getState(stateName);
		this.postalCode = new ZipCode(postalCode);
		this.country = country;
	}
	public Address(String addressLine1, String addressLine2, String city, String stateName, String postalCode,
			String country) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = State.getState(stateName);
		this.postalCode = new ZipCode(postalCode);
		this.country = country;
	}
	
	//Constructors
	
	
	// Some address methods.
}
