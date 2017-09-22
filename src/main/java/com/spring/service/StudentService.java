package com.spring.service;

import java.util.List;

import com.spring.entity.Student;

public interface StudentService {

	public void addStudent(Student p);

	public void updateStudent(Student p);

	public List<Student> listStudents();

	public Student getStudentByEmail(Student p);

	public void removeStudent(Student p);

}
