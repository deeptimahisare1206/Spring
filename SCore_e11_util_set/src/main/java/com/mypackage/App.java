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
    	ApplicationContext ac= new ClassPathXmlApplicationContext("config.xml");
    	Person p = (Person)ac.getBean("myFriend");
        System.out.println( "Friends:- \n"+ p.getFriends());
    }
}
