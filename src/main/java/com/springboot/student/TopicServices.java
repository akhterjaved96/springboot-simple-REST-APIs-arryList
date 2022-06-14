package com.springboot.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicServices {

	private List<Student> students = new ArrayList<>(
			Arrays.asList(new Student(1, "Javed Akhter", "Moradabad"),
					new Student(2, "Mohd Azeem", "Amroha"),
					new Student(3, "Noor Shan", "Moradabad")));

	// getting all student
	public List<Student> getAllStudents() {
		return students;
	}
	
	// adding student
	public void addStudent(Student student) {
		students.add(student);
	}

	// getting a single student
	public Student getStudent(int id) {
		//return students.stream().filter(t -> t.getId()==id).findFirst().get();
		Student s=null;
		for(Student student:students) {
			if(student.getId()==id) {
				s=student;
				break;
			}
		}
		return s;
	}

	// updating student
	public void updateStudent(int id, Student student) {
		for (int i = 0; i < students.size(); i++) {
			Student t = students.get(i);
			if (t.getId()==id) {
				students.set(i, student);
				return;
			}
		}
	}

	// deleting student 
	public void deleteStudent(int id) {
		students.removeIf(t -> t.getId()==id);
	}

}
