package com.mypackage;

public class Sum {
	int x,y;
	public Sum(int x,int y) {
		
		this.x=x;
		this.y=y;
		System.out.println("int constructor" +x+"   "+y);
	}
	
	public Sum(double x, double y) {
		this.x=(int)x;
		this.y=(int)y;
		System.out.println("double constructor" +x+"   "+y);
	}

	public Sum(String x, String y) {
		this.x=Integer.parseInt(x);
		this.y=Integer.parseInt(y);
		System.out.println("String constructor" +x+"   "+y);
	}
	
	public void add() {
		int z=x+y;
		System.out.println(z);
	}
}
