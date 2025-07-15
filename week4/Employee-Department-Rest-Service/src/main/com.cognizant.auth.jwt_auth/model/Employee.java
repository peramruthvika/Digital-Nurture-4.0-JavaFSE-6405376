package com.cognizant.auth.jwt_auth.model;

import java.util.List;

public class Employee {
    private int id;
    private String name;
    private Department department;
    private List<Skill> skills;

    // Constructors
    public Employee() {}

    public Employee(int id, String name, Department department, List<Skill> skills) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.skills = skills;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Skill> getSkills() {
        return skills;
    }
    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
