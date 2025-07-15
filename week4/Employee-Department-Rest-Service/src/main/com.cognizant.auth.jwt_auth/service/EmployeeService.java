package com.cognizant.auth.jwt_auth.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.auth.jwt_auth.dao.EmployeeDao;
import com.cognizant.auth.jwt_auth.model.Employee;

@SuppressWarnings("unused")
@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

   
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }
}