package com.mypackage;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Starting {

	int x;
	
public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
		System.out.println("setter method of x");
	}
@PostConstruct
	public void start() {
			
			System.out.println("Init method..");
		
	}
@PreDestroy
public void end() {
		
		System.out.println("Destroy method..");
	}
}
