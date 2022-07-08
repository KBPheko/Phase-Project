package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Class {
@Id
private int classid;
private String classname;
@OneToOne(mappedBy = "cl")
private Subject subject;
@ManyToMany
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
	this.subject = subject;
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
