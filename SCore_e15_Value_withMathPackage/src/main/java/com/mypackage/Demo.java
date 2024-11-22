package com.mypackage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{12+13-5}")
	int x;
	@Value("#{12*5}")
	int y;
	@Value("#{T(java.lang.Math).sqrt(144)}")
	double sq;
	@Value("#{T(java.lang.Math).E}")
	double e;
	@Value("#{new String('Deep')}")
	String name;
//	@Value("#{0}")
	boolean b;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getSq() {
		return sq;
	}

	public void setSq(double sq) {
		this.sq = sq;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}
	
	
}
