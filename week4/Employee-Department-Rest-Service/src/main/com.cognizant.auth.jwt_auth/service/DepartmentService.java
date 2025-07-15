package com.cognizant.auth.jwt_auth.service;


import com.cognizant.auth.jwt_auth.dao.DepartmentDao;
import com.cognizant.auth.jwt_auth.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SuppressWarnings("unused")
@Service
public class DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;

   
    public List<Department> getAllDepartments() {
        return departmentDao.getAllDepartments();
    }
}
