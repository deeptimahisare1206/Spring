package com.mycompany;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	AnnotationConfigApplicationContext aca = new AnnotationConfigApplicationContext(Javaconfig.class);
    	Demo d = (Demo)aca.getBean("getDemo"); // comes from the annotation @bean  Demo method
    	d.m();
    }
}
