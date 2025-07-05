package com.cognizant.orm_learn.repository;

import com.cognizant.orm_learn.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}