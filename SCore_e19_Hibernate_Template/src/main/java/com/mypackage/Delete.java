package com.mypackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Delete {

	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
	Student st1 = new Student();
	st1.set
	
	
	StudentDao sd = ac.getBean("stuDao",StudentDao.class);
	sd.delete(st);
	
	System.out.println("Value=");
 

}
