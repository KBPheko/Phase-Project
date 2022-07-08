package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.Class;
import com.resource.SessionFactoryResource;

public class ClassDao {

	public int addClass(Class cl) {
		try {
			SessionFactory sf = SessionFactoryResource.getSessionFactoryReference();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
			      session.save(cl);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
	public List<Class> getAllClasses(){
		SessionFactory sf = SessionFactoryResource.getSessionFactoryReference();
		Session session = sf.openSession();
		Query<Class> qry = session.createQuery("select c from Class c");
		List<Class> listOfClasses = qry.list();
		return listOfClasses;
	}
}
