package com.cognizant.orm_learn;

import com.cognizant.orm_learn.entity.*;
import com.cognizant.orm_learn.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class CountryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CountryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner run(EmployeeRepository empRepo,
                          DepartmentRepository deptRepo,
                          ProjectRepository projRepo) {
        return args -> {
            Department dept = new Department();
            dept.setName("Engineering");
            deptRepo.save(dept);

            Project proj1 = new Project();
            proj1.setTitle("Apollo");
            Project proj2 = new Project();
            proj2.setTitle("Zeus");
            projRepo.saveAll(List.of(proj1, proj2));

            Employee emp = new Employee();
            emp.setName("Alice");
            emp.setDepartment(dept);
            emp.setProjects(Set.of(proj1, proj2));
            empRepo.save(emp);
        };
    }
}
