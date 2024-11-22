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
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	Student st = (Student)ac.getBean("student");
        System.out.println(st.getName() );
        System.out.println(st);
        
        Student st2 = (Student)ac.getBean("student");
        System.out.println(st2.getName() );
        System.out.println(st2);
    }
}
