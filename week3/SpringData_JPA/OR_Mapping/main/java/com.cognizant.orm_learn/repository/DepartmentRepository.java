package com.cognizant.orm_learn.repository;

import com.cognizant.orm_learn.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {}