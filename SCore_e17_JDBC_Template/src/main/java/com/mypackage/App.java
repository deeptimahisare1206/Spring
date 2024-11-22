package com.mypackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	JdbcTemplate jt  = (JdbcTemplate)ac.getBean("my_jdbc");
    	System.out.println(jt);
    }
}
