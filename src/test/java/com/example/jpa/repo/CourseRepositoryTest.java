package com.example.jpa.repo;

import com.example.jpa.domain.Course;
import com.example.jpa.domain.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseRepositoryTest {
    private DepartmentRepository departmentRepository;
    private CourseRepository courseRepository;

    @Autowired
    public CourseRepositoryTest(DepartmentRepository departmentRepository, CourseRepository courseRepository) {
        this.departmentRepository = departmentRepository;
        this.courseRepository = courseRepository;
    }

    @Test
    public void createCourse(){
        Department department = departmentRepository.save(new Department("Physics"));
    }
}
