package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
private int studentid;
private String studentname;
private int age;
private int stdclassid;
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

}
