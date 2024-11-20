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
    	A a =(A)ac.getBean("classA");
    	System.out.println(a.getX());
        System.out.println(a.getBref().getY() );
    }
}
