package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Teacher {
@Id
private int teacherid;
private String teachername;
@ManyToMany(cascade = CascadeType.MERGE)
@JoinTable(name="teacher_class", joinColumns = {@JoinColumn(name="teacherid")},inverseJoinColumns = {@JoinColumn(name="classid")})
private List<Class> listOfClasses;
public int getTeacherid() {
	return teacherid;
}
public void setTeacherid(int teacherid) {
	this.teacherid = teacherid;
}
public String getTeachername() {
	return teachername;
}
public void setTeachername(String teachername) {
	this.teachername = teachername;
}
public List<Class> getListOfClasses() {
	return listOfClasses;
}
public void setListOfClasses(List<Class> listOfClasses) {
	this.listOfClasses = listOfClasses;
}

}
