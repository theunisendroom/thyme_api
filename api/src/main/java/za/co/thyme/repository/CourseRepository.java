package za.co.thyme.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import za.co.thyme.domain.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
    public Course findByName(String name);
}	
