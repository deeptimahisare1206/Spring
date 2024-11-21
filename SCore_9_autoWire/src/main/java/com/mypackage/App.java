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
    	Employee e = (Employee)ac.getBean("emp");
        System.out.println( "City: " +e.getAddress().getCity()+"\n"+"State: " +e.getAddress().getState());
    }
}
