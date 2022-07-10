package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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
	
	public List<Object[]> joinClassAndStudent(){
		SessionFactory sf = SessionFactoryResource.getSessionFactoryReference();
		Session session = sf.openSession();
		Query qry = session.createNativeQuery("select c.classname,c.classid, s.studentname from class c inner join student s on c.classid = s.stdclassid");
		
		List<Object[]> obj = qry.list();
		return obj;
	}
	
	public Class findClassById(int id) {
		Configuration con = new Configuration(); 
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Class e=session.get(Class.class, id);
		return e;
	}
}
