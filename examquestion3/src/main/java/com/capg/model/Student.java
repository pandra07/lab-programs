package com.capg.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studenttable")
public class Student {
	@Id
int id;
String name;
double height;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, double height) {
	super();
	this.id = id;
	this.name = name;
	this.height = height;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", height=" + height + "]";
}

}
