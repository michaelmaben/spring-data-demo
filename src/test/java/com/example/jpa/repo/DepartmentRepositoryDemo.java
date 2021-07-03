package com.example.jpa.repo;


import com.example.jpa.domain.Course;
import com.example.jpa.domain.Department;
import com.example.jpa.domain.Person;
import com.example.jpa.domain.Staff;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class DepartmentRepositoryDemo {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void createDepartment(){
        assertEquals(3, departmentRepository.findAll().stream().count());
        assertEquals("Humanities", departmentRepository.findByName("Humanities").getName());
    }
}
