package com.college.persistence;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.college.entities.Student;

@Repository("studentDao")
public class StudentDaoImpl extends AbstractDao<Integer, Student> implements StudentDao{

	@Override
	public void register(Student student) {
		persist(student);
	}

	@Override
	public Student searchStudentByName(String name) {
		Criteria criteria = createEntityCriteria();
		return (Student) criteria.add( Restrictions.like("name",name)).uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> findAllStudents() {
		Criteria criteria = createEntityCriteria();
        return (List<Student>) criteria.list();
	}

	@Override
	public void delete(Integer id) {
		Student s = getByKey(id);
		delete(s);
	}

}
