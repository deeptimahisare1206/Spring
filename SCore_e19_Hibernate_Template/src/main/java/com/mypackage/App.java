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
       
    	Student st = new Student();
    	st.setId(101);
    	st.setName("Ghostu");
    	st.setPercent(90);
    	
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	StudentDao sd = (StudentDao)ac.getBean("StudentDao");
    	sd.insert(st);
    	
    }
}
