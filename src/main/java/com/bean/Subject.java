package com.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Subject {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "subjectid")
private int subjectid;
private String subjecttitle;
@OneToOne(targetEntity = Class.class, cascade = CascadeType.ALL)
@JoinColumn(name="subjectid", referencedColumnName = "classid") //where my subclassid is my foreign key
private Class cl;
//@JoinColumn(name="subjectid") //where my subclassid is my foreign key

public Subject()
{
}

public Subject(String subjectname, int id) {
	this.subjecttitle=subjectname;
	this.subjectid= id;
}


public int getSubjectid() {
	return subjectid;
}
public void setSubjectid(int subjectid) {
	this.subjectid = subjectid;
}
public String getSubjectname() {
	return subjecttitle;
}
public void setSubjectname(String subjecttitle) {
	this.subjecttitle = subjecttitle;
}
public Class getCl() {
	return cl;
}
public void setCl(Class cl) {
	this.cl = cl;
}

}
