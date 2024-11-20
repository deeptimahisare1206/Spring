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
    	ApplicationContext ac =new ClassPathXmlApplicationContext("config.xml");
    	Student st =(Student)ac.getBean("stud");
    	System.out.println(st.getRoll());
        System.out.println( st.getName() );
        System.out.println(st.getPercent());
    }
}
