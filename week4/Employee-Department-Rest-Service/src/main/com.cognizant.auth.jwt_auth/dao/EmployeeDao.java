package com.cognizant.auth.jwt_auth.dao;

import com.cognizant.auth.jwt_auth.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao {
    private static List<Employee> EMPLOYEE_LIST;

    @SuppressWarnings("unchecked")
	@Autowired
    public EmployeeDao(ApplicationContext context) {
        EMPLOYEE_LIST = (List<Employee>) context.getBean("employeeList");
    }

    public List<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }}