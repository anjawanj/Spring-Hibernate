package com.college.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entities.Student;
import com.college.persistence.StudentDaoImpl;

@Service
public class StudentService {
	
	@Autowired
	public StudentDaoImpl studentDaoImpl;
	
	public void register(Student s)
	{
		studentDaoImpl.register(s);
	}
	
	public Student searchStudentByName(String name)
	{
		return studentDaoImpl.searchStudentByName(name);
	}
	
	public List<Student> findAllStudents(){
		return studentDaoImpl.findAllStudents();
	}

	public void delete(Integer id)
	{
		studentDaoImpl.delete(id);
	}
}
