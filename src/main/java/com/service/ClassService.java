package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Class;
import com.dao.ClassDao;

public class ClassService {

	ClassDao cd = new ClassDao();
	
	public String addClass(Class cl) {

		if(cd.addClass(cl)>0) {
			return "A new class has been added successfully";
		} else {
			return "Class didn't store";
		}
	}
	
	public List<Class> getAllClassess(){
		List<Class> listOfClasses = cd.getAllClasses();
		Iterator<Class> li = listOfClasses.iterator();
		while(li.hasNext()) {
			Class cc = li.next();
		}
		return listOfClasses;
	}
	
	public List<Object[]> findTrainerAndStudent(){
		return cd.joinClassAndStudent();
	}
}
