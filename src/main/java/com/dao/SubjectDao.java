package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.Subject;
import com.resource.SessionFactoryResource;

public class SubjectDao {

	public int storeSubject(Subject subject) {
		try {
			SessionFactory sf = SessionFactoryResource.getSessionFactoryReference();
			Session session = sf.openSession();
			Transaction trans = session.getTransaction();
			trans.begin();
			         session.save(subject);
			trans.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
	public List<Subject> getAllSubjects(){
		SessionFactory sf = SessionFactoryResource.getSessionFactoryReference();
		Session session = sf.openSession();
		Query<Subject> qry = session.createQuery("select s from Subject s");
		List<Subject> listOfSubject = qry.list();
		return listOfSubject;
	}
}
