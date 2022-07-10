package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Student;
import com.dao.StudentDao;

public class StudentService {

	StudentDao sd = new StudentDao();
	
	public String storeStudentDetails(Student student) {
		if(sd.storeStudent(student)>0) {
			return "Student record stored successfully";
		} else {
			return "Student record didn't store";
		}
	}
	
	public List<Student> getAllStudents(){
		List<Student> stdList = sd.getAllStudent();
		Iterator<Student> li  = stdList.iterator();
		while(li.hasNext()) {
			Student si = li.next();
		}
		return stdList;
	}
}
