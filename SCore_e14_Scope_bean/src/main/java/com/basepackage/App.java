package com.basepackage;

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
    	ApplicationContext ac= new ClassPathXmlApplicationContext("config.xml");
    	Employee ep = (Employee)ac.getBean("ser");
    	System.out.println(ep.hashCode());
    	
    	Employee ep1 = (Employee)ac.getBean("ser");
    	System.out.println(ep1.hashCode());
    }
}
