package com.anil.imcs.customerjpa.entity;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class Person {
	private String firstName;
	private String lastName;
	
	//partial method implementations
}
