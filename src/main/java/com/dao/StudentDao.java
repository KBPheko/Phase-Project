package com.dao;

import java.util.List;

import org.hibernate.Query;
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
	
	public List<Student> getAllStudent(){
		SessionFactory sf = SessionFactoryResource.getSessionFactoryReference();
		Session session = sf.openSession();
		Query<Student> qry = session.createQuery("select s from Student s");
		List<Student> stdList = qry.list();
		return stdList;
	}
}
