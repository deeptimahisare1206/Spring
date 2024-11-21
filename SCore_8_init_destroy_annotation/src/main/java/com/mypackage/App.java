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
    	AbstractApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	Starting st = (Starting)ac.getBean("starting");
    	System.out.println(st.getX());
    	ac.registerShutdownHook();
    }
}
