package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Subject {
@Id
private int subjectid;
private String subjectname;
@OneToOne(optional = true)
@JoinColumn(name="subclassid", referencedColumnName = "classid") //where my subclassid is my foreign key
private Class cl;
public int getSubjectid() {
	return subjectid;
}
public void setSubjectid(int subjectid) {
	this.subjectid = subjectid;
}
public String getSubjectname() {
	return subjectname;
}
public void setSubjectname(String subjectname) {
	this.subjectname = subjectname;
}
public Class getCl() {
	return cl;
}
public void setCl(Class cl) {
	this.cl = cl;
}

}
