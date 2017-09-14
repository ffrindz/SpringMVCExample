package com.spring.common;

public class Student {
	String name;
	int age;
	int rollNo;

	public Student(String name, int age, int rollNo) {
		super();
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

}
