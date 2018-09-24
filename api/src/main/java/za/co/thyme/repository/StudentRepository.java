package za.co.thyme.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import za.co.thyme.domain.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
 
}	
