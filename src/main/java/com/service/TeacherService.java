package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Teacher;
import com.dao.TeacherDao;

public class TeacherService {
	
	TeacherDao td = new TeacherDao();
	
	public String storeTeacher(Teacher teacher) {
		if(td.storeTeacher(teacher)>0) {
			return "A Teacher is stored successfully";
		}else {
			return "A Techer didn't store";
		}
	}
	
	public List<Teacher> getAllTeachers() {
		List<Teacher> listOfTeachers = td.getAllTeachers();
		Iterator<Teacher> li  = listOfTeachers.iterator();
		while(li.hasNext()) {
			Teacher pp = li.next();
		}
		return listOfTeachers;
	}
}
