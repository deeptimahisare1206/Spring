package com.mypackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Employee {

	//Without Qualifier Autowire is Bytype if only one bean existed
	@Autowired
	//@Qualifier(value="address") //autowire byName Annotation 
	Address address2;

	public Address getAddress() {
		return address2;
	}

	public void setAddress(Address address2) {
		this.address2 = address2;
	}
	
}
