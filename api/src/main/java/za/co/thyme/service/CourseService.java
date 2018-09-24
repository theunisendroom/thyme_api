package za.co.thyme.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.co.thyme.domain.Course;
import za.co.thyme.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public Course getCourseByName(String courseName){
		Course course = courseRepository.findByName(courseName);

		return course;
	}
}
