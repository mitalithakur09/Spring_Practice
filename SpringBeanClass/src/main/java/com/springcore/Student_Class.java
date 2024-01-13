package com.springcore;

public class Student_Class {
       
	int student_id;
	String student_name;
	String student_class;
	public Student_Class() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student_Class(int student_id, String student_name, String student_class) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_class = student_class;
	}
	@Override
	public String toString() {
		return "Student_Class [student_id=" + student_id + ", student_name=" + student_name + ", student_class="
				+ student_class + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_class() {
		return student_class;
	}
	public void setStudent_class(String student_class) {
		this.student_class = student_class;
	}
	
}
