package com.college.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	Integer id;
	
	String name;
	Integer age;
	Integer dateOfJoining;
	String currentYear;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Integer dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getCurrentYear() {
		return currentYear;
	}
	public void setCurrentYear(String currentYear) {
		this.currentYear = currentYear;
	}
	

}
