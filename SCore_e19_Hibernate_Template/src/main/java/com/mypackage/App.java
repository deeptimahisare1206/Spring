package com.mypackage;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
//=======================================================================
		// Insert
//    		Student st = new Student();
//    		st.setId(4);
//    		st.setName("jkjkhchjksd");
//    		st.setPercent(19);
//    		
//    		StudentDao sd = ac.getBean("stuDao",StudentDao.class);
//    		int i=sd.insert(st);
//    		
//    		System.out.println("Value="+i);

//=======================================================================

		// Delete
//		Student st = new Student();
//		st.setId(4);
//
//		StudentDao sd = ac.getBean("stuDao", StudentDao.class);
//		sd.delete(st);
//
//		System.out.println("Value=");

//=======================================================================

		//Update
		Student st = new Student();
		st.setName("Smarty");
		st.setPercent(44);
		StudentDao sd = ac.getBean("stuDao", StudentDao.class);
		sd.update(st);
		System.out.println("Update Successfull!!");
		
//=======================================================================
		// Select One

//		Student st = new Student();
//		StudentDao sd = ac.getBean("stuDao", StudentDao.class);
//		Student i = sd.selectOne(st);
//		System.out.println(i.getId()+" : "+i.getName()+" : "+i.getPercent());

//=======================================================================

		// Select All
//		Student st = new Student();
//		StudentDao sd = ac.getBean("stuDao", StudentDao.class);
//		List<Student> l = sd.selectAll(st);
//		for (Student student : l) {
//			System.out.println(student.getId()+" : "+student.getName()+" : "+student.getPercent());
//		}

	}
}
