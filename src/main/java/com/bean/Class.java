package com.bean;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Class {
private int classId;
private String className;
private List<Student> listOfStudents;
}
