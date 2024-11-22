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
        Demo d = (Demo)ac.getBean("demo");
        System.out.println(d.getX());
        System.out.println(d.getY());
        System.out.println(d.getSq());
        System.out.println(d.getE());
        System.out.println(d.getName());
        System.out.println(d.isB());
    }
}
