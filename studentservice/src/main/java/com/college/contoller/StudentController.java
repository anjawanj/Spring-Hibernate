package com.college.contoller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.college.entities.Student;
import com.college.user.service.StudentService;

@Controller
public class StudentController {
	
	 @Autowired
	  public StudentService studentService;
	  
	 @RequestMapping(value = "/register", method = RequestMethod.GET)
	  public ModelAndView showRegister() {
	    ModelAndView mav = new ModelAndView("register");
	    mav.addObject("student", new Student());
	    return mav;
	  }
	  
	  @RequestMapping(value = "/registerStudent", method = RequestMethod.POST)
	  public ModelAndView addstudent(@ModelAttribute("student") Student student) {
	  studentService.register(student);
	  return new ModelAndView("welcome", "name", student.getName());
	  }
	  
	  @RequestMapping(value = "/showAll", method = RequestMethod.GET)
	    public String listEmployees(ModelMap model) {
	 
	        List<Student> students = studentService.findAllStudents();
	        model.addAttribute("students", students);
	        return "allstudents";
	    }
	  
	  @RequestMapping(value = "/search", method = RequestMethod.GET)
	  public ModelAndView showSearchStudent() {
		ModelAndView mav = new ModelAndView("search"); 
		return mav; 
	  }
	  
	  @RequestMapping(value = "/searchStudent", method = RequestMethod.POST)
	  public ModelAndView searchStudent(HttpServletRequest request, HttpServletResponse response) {
		  Student student = studentService.searchStudentByName(request.getParameter("name"));
		  ModelAndView mav = new ModelAndView("searchResult");
		  mav.addObject(student);
	   return mav;
	  }
	  
	  @RequestMapping(value = "/delete", method = RequestMethod.GET)
	  public ModelAndView showDeleteStudent() {
		ModelAndView mav = new ModelAndView("delete"); 
		return mav; 
	  }
	  
	  @RequestMapping(value = "/deleteStudent", method = RequestMethod.POST)
	  public ModelAndView deleteStudent(HttpServletRequest request, HttpServletResponse response) {
		  studentService.delete(Integer.parseInt(request.getParameter("id")));
		  return new ModelAndView("success");
	  }


}
