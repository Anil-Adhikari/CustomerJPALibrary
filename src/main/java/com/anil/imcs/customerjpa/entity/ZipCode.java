package com.anil.imcs.customerjpa.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

//Separate class for zipcode as it is generally used for many operations.

/*@Entity
@Table(name="zipcodes")*/

@Embeddable

@NoArgsConstructor

@Data
public
class ZipCode {
	
/*	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="zip_code_id")
	Integer zipCodeId;*/
	
	String value;

	public ZipCode(String value) {
		this.value = value;
	}
	
	public String getString() {
		return value;
	}
	
	//Other operations to validate, automatically check, search or query.
	
}