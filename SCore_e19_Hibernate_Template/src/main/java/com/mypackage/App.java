package com.mypackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
			
    		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    		Student st = new Student();
    		st.setId(1011);
    		st.setName("Ghostu");
    		st.setPercent(90);
    		
    		StudentDao sd = ac.getBean("stuDao",StudentDao.class);
    		int i=sd.insert(st);
    		
    		System.out.println("Value="+i);
		
    		/*
    		st.setId(101);
    		
    		
    		StudentDao sd = ac.getBean("stuDao",StudentDao.class);
    		sd.delete(st);
    		
    		System.out.println("Value=");
		 * 
    		 */

    }
}
