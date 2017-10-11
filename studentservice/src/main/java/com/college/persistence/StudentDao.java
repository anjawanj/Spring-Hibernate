package com.college.persistence;

import java.util.List;

import com.college.entities.Student;

public interface StudentDao {
  void register(Student student);
  Student searchStudentByName(String name);
  List<Student> findAllStudents();
  void delete(Integer id);
}