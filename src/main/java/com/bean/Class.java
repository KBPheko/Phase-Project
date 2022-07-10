package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.dao.SubjectDao;



@Entity
public class Class {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int classid;
private String classname;
@OneToOne( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
@JoinColumn(name = "subclassid_FK")
private Subject subject;
@ManyToMany(mappedBy = "listOfClasses")
private List<Teacher> listOfTeachers;
@OneToMany(mappedBy = "stdclassid", cascade = CascadeType.ALL)
private List<Student> listOfStudents;

public int getClassid() {
	return classid;
}
public void setClassid(int classid) {
	this.classid = classid;
}
public String getClassname() {
	return classname;
}
public void setClassname(String classname) {
	this.classname = classname;
}
public Subject getSubject() {
	return subject;
}
public void setSubject(Subject subject) {
	
	System.out.println("rtythjgcfhhjvt");
	this.subject = subject;
	//this.subject = this.subDao.getSubject(subject_id);
	System.out.println("rtythjgcfhgv"+this.subject.getSubjectname());
}
public List<Teacher> getListOfTeachers() {
	return listOfTeachers;
}
public void setListOfTeachers(List<Teacher> listOfTeachers) {
	this.listOfTeachers = listOfTeachers;
}
public List<Student> getListOfStudents() {
	return listOfStudents;
}
public void setListOfStudents(List<Student> listOfStudents) {
	this.listOfStudents = listOfStudents;
}

}
