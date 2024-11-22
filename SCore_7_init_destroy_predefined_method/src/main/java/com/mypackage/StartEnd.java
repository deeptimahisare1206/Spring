package com.mypackage;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class StartEnd implements InitializingBean, DisposableBean{
	
	int x;
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Init method..");
	}
public void destroy()throws Exception{
		
		System.out.println("Destroy method..");
	}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}


}
