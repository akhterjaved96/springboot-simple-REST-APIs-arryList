package com.springboot.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicServices topicServices;

	// getting all elements
	@RequestMapping("/student")
	public List<Student> getAllStudents() {
		return topicServices.getAllStudents();
	}

	// getting a single student on the basis of id
	@RequestMapping("/student/{id}")
	public Student getStudent(@PathVariable int id) {
		return topicServices.getStudent(id);
	}

	// adding student by POST request
	@RequestMapping(method = RequestMethod.POST, value = "/student")
	public void addStudent(@RequestBody Student student) {
		topicServices.addStudent(student);
	}

	// updating student on the basis of id by PUT request
	@RequestMapping(method = RequestMethod.PUT, value = "/student/{id}")
	public void updateStudent(@RequestBody Student student, @PathVariable int id) {
		topicServices.updateStudent(id, student);
	}

	// deleting student on the basis of id by DELETE request
	@RequestMapping(method = RequestMethod.DELETE, value = "/student/{id}")
	public void deleteStudent(@PathVariable int id) {
		topicServices.deleteStudent(id);
	}

}
