package com.mypackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

import javax.transaction.Transactional;

@Transactional
public class StudentDao {

	@Autowired
	HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	public int insert(Student st) {
		int i = (Integer) ht.save(st);

		return i;
	}

	public void delete(Student st) {

		ht.delete(st);
	}
	
	public void update(Student st) {
		ht.update(st);
	}
	
	public Student selectOne(Student st) {
		Student s =ht.get(Student.class,1);
		return s;
	}
	
	public List<Student> selectAll(Student st){
		List<Student> l = ht.loadAll(Student.class);
		return l;
	}
	

}
