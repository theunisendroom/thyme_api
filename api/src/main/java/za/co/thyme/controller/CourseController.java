package za.co.thyme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import za.co.thyme.domain.Course;
import za.co.thyme.service.CourseService;

@Controller
@RequestMapping("course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/name/{name}")
    public ResponseEntity<Course> getCourses(@PathVariable String name) {
        return new ResponseEntity<>(courseService.getCourseByName(name), HttpStatus.OK);
    }
}