package com.example.jpa.repo;

import com.example.jpa.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    public Department findByName(String name);
}
