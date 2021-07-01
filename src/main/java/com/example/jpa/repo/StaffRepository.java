package com.example.jpa.repo;

import com.example.jpa.domain.Staff;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StaffRepository extends PagingAndSortingRepository<Staff, Integer> {
}
