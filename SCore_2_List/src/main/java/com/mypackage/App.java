package com.mypackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
		Employee e = (Employee) con.getBean("emp1");

		System.out.println(e.getName() + " \n " + e.getMobile() + " \n " + e.getSkills() + " \n " + e.getProjects());
		System.out.println("getClass method: ");
		System.out.println(e.getMobile().getClass());
		System.out.println(e.getSkills().getClass());
		System.out.println(e.getProjects().getClass());
	}
}
