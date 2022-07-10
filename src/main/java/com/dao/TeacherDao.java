package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Teacher;
import com.resource.SessionFactoryResource;

public class TeacherDao {

	public int storeTeacher(Teacher teacher) {
		try {
			SessionFactory sf = SessionFactoryResource.getSessionFactoryReference();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
					session.save(teacher);
			tran.commit();
			System.out.println("Record stored successfully");
			return 1;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public List<Teacher> getAllTeachers() {
		SessionFactory sf = SessionFactoryResource.getSessionFactoryReference();
		Session session = sf.openSession();
		Query<Teacher> qry = session.createQuery("select t from Teacher t");
		List<Teacher> listOfTeachers = qry.list();
		return listOfTeachers;
	}
}
