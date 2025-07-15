package com.cognizant.auth.jwt_auth.dao;

import com.cognizant.auth.jwt_auth.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentDao {
    private static List<Department> DEPARTMENT_LIST;

    @Autowired
    public DepartmentDao(ApplicationContext context) {
        DEPARTMENT_LIST = new ArrayList<>();
        DEPARTMENT_LIST.add((Department) context.getBean("departmentHR"));
        DEPARTMENT_LIST.add((Department) context.getBean("departmentIT"));
    }

    public List<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}