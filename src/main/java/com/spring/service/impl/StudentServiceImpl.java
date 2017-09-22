package com.spring.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.StudentDAO;
import com.spring.entity.Student;
import com.spring.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentDAO studentDAO;

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	@Override
	@Transactional
	public void addStudent(Student p) {
		this.studentDAO.addStudent(p);
	}

	@Override
	@Transactional
	public void updateStudent(Student p) {
		this.studentDAO.updateStudent(p);
	}

	@Override
	@Transactional
	public List<Student> listStudents() {
		return this.studentDAO.listStudents();
	}

	@Override
	@Transactional
	public Student getStudentByEmail(Student p) {
		return this.studentDAO.getStudentByEmail(p);
	}

	@Override
	@Transactional
	public void removeStudent(Student p) {
		this.studentDAO.removeStudent(p);
	}

}
