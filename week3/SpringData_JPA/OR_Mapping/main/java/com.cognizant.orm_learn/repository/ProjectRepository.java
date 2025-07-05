package com.cognizant.orm_learn.repository;

import com.cognizant.orm_learn.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {}