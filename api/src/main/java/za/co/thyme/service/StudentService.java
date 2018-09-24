package za.co.thyme.service;

import java.util.List;

import org.apache.commons.collections4.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.thyme.domain.Student;
import za.co.thyme.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getStudents(){
		Iterable<Student> students = studentRepository.findAll();
		
		List<Student> studentsList = IteratorUtils.toList(students.iterator()); 

		return studentsList;
	}
}