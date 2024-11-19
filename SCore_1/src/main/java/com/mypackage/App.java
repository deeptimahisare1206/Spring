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
    	ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
    	Student st = (Student)con.getBean("stu1");
        System.out.println( st.getS_id()+"  "+st.getS_name() +"   "+st.getS_percent());
        Student st1 = (Student)con.getBean("stu2");
        System.out.println( st1.getS_id()+"  "+st1.getS_name() +"   "+st1.getS_percent());
//        Student st2 = (Student)con.getBean("stu3");
//        System.out.println( st2.getS_id()+"  "+st2.getS_name() +"   "+st2.getS_percent());
    }
}
