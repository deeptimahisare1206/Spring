package com.mypackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import jakarta.transaction.Transactional;

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
	
	public void insert(Student st) {
		Student i = (Student)ht.save(st);
	}
}
