package com.spring.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.spring.dao.StudentDAO;
import com.spring.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	private static final Logger logger = LoggerFactory.getLogger(StudentDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addStudent(Student p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Student saved successfully, Student Details="+p);
	}

	@Override
	public void updateStudent(Student p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Student updated successfully, Student Details="+p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> listStudents() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Student> studentsList = session.createQuery("from Student").list();
		for(Student p : studentsList){
			logger.info("Student List::"+p);
		}
		return studentsList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Student getStudentByEmail(Student p) {
		Session session = this.sessionFactory.getCurrentSession();		
		Query studentsQuery = session.createQuery("from Student where email=:email");
		studentsQuery.setParameter("email", p.getEmail());
		List<Student> studentsList = studentsQuery.list();
		logger.info("Student loaded successfully, Student details="+studentsList);
		return studentsList.get(0);
	}

	@Override
	public void removeStudent(Student p) {
		Session session = this.sessionFactory.getCurrentSession();		
		Query studentsQuery = session.createQuery("DELETE from Student where email=:email");
		studentsQuery.setParameter("email", p.getEmail());
		int rowsAffected = studentsQuery.executeUpdate();
		logger.info("Student delete successfully, rows affected="+rowsAffected);
	}
	
}
