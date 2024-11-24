package com.myoperations;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
        JdbcTemplate jt = (JdbcTemplate)ac.getBean("my_jdbc",JdbcTemplate.class);
//        System.out.println(jt);

//      =========================================================================================
        //Insert
//        String query = "insert into Student(sname,percent) values(?,?)";
//        int i =jt.update(query,"Ceep",97.9);
//        System.out.println("Inserted Successfully!!" + i);
//        =========================================================================================
        
        //Delete
//        String query = "delete from Student where sid = ?";
//        int i = jt.update(query, 4);
//      System.out.println("Deleted Successfully!!" + i);
        
//      =========================================================================================
        

        //Update
//        String query = "update student set sname=? where sid = ?";
//        int i = jt.update(query, "Heep",2);
//      System.out.println("Updated Successfully!!" + i);
      
//      =========================================================================================
        
        //Select one Entry
//        String query = "select * from Student where sid =?";
//        Student i = jt.queryForObject(query, new RowMapperImpl(),2);
//
//      System.out.println("Roll no.: "+i.getRoll()+"\nName: "+i.getName()+"\nPercentage: "+i.getPercent());
//      =========================================================================================
      
      //Select all entry.
      
        String query = "select * from Student";
        List<Student> li = jt.query(query, new RowMapperImpl());
        Iterator<Student> ite = li.iterator();
        
        while (ite.hasNext()) {
			Student s = (Student) ite.next(); 
			System.out.println(""+s.getRoll()+" : "+s.getName()+" : "+s.getPercent());		     
		}

    }
}
