package com.mypackage;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

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
		int i = (Integer)ht.save(st);
		
		// ht.delete(st);
		return i;
	}
}
