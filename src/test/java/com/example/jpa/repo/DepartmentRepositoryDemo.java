package com.example.jpa.repo;


import com.example.jpa.domain.Department;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class DepartmentRepositoryDemo {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Test
    public void createDepartment(){
        departmentRepository.save(new Department("Physics"));
        departmentRepository.flush();
        assertEquals(1, departmentRepository.findAll().stream().count());
    }
}
