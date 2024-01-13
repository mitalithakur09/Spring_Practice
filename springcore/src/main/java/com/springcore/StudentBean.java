package com.springcore;

public class StudentBean {
   private int id;
   private String name;
   private String student_address;
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
public String getStudent_address() {
	return student_address;
}
public void setStudent_address(String student_address) {
	this.student_address = student_address;
}
public StudentBean() {
	super();
	// TODO Auto-generated constructor stub
}
public StudentBean(int id, String name, String student_address) {
	super();
	this.id = id;
	this.name = name;
	this.student_address = student_address;
}
@Override
public String toString() {
	return "StudentBean [id=" + id + ", name=" + name + ", student_address=" + student_address + ", getId()=" + getId()
			+ ", getName()=" + getName() + ", getStudent_address()=" + getStudent_address() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
   
}
