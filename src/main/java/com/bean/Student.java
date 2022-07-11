package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
private int studentid;
private String studentname;
private int age;
private int stdclassid; //FK
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getStdclassid() {
	return stdclassid;
}
public void setStdclassid(int stdclassid) {
	this.stdclassid = stdclassid;
}

@Override
public String toString() {
	//return "Student [name: "+studentname+", age: "+age+", std ID: "+ studentid+"]";
	return ("Student Name: "+ this.getStudentname()+
			" Student Age: "+ this.age +
			" Student ID: "+this.studentid);
}
}
