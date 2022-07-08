package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Subject;
import com.dao.SubjectDao;

public class SubjectService {

	SubjectDao sd = new SubjectDao();
	
	public String storeSubject(Subject sub) {
		if(sd.storeSubject(sub)>0) {
			return "Subject stored successfully";
		} else {
			return "Subject didn't store";
		}
	}
	
	public List<Subject> getAllSubjects(){
		List<Subject> subjectList = sd.getAllSubjects();
		Iterator<Subject> li  = subjectList.iterator();
		while(li.hasNext()) {
			Subject pp = li.next();
		}
		return subjectList;
	}
}
