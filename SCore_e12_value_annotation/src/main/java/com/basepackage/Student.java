package com.basepackage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu") //if not specified the name bean name by default will be the lowercase of the class name 
public class Student {
	
	int roll;
	String name;
	@Value("12.0")
	double per;
	public int getRoll() {
		return roll;
	}
	@Value("101")
	public void setRoll(int roll) {
		this.roll = roll;
		System.out.println("Setter of roll");
	}
	public String getName() {
		return name;
	}
	@Value("Depth")
	public void setName(String name) {
		this.name = name;
		System.out.println("Setter of name");
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
		System.out.println("Setter of percent");
	}
	
	

}
