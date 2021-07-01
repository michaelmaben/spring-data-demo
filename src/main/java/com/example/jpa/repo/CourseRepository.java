package com.example.jpa.repo;


import com.example.jpa.domain.Course;
import org.springframework.data.repository.CrudRepository;

public interface  CourseRepository extends CrudRepository<Course, String> {

}
