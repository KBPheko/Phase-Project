package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.Student;
import com.resource.SessionFactoryResource;

public class StudentDao {
	
	public int storeStudent(Student student) {
		try {
			SessionFactory sf = SessionFactoryResource.getSessionFactoryReference();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
			      session.save(student);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}
}
