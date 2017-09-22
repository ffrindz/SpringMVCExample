package com.spring.dao;

import java.util.List;

import com.spring.entity.Student;

public interface StudentDAO {

	public void addStudent(Student p);

	public void updateStudent(Student p);

	public List<Student> listStudents();

	public Student getStudentByEmail(Student p);

	public void removeStudent(Student p);
}
