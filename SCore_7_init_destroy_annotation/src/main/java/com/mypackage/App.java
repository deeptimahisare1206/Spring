package com.mypackage;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext aac = new ClassPathXmlApplicationContext("config.xml");
    	StartEnd se = (StartEnd)aac.getBean("SEmethod");
        System.out.println( "X:- "+ se.getX());
        aac.registerShutdownHook();
    }
}
