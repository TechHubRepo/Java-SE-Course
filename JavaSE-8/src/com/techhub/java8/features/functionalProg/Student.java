package com.techhub.java8.features.functionalProg;

public class Student {

	private String name;
	private String subject;
	private int marks;

	public Student() {
		super();
	}

	public Student(String name, String subject, int marks) {
		super();
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + ", marks=" + marks + "]";
	}
}
