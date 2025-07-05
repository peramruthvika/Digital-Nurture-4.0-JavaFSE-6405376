package com.cognizant.orm_learn.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "co_code") // matches DB column name
    private String code;

    @Column(name = "co_name") // matches DB column name
    private String name;

    public Country() {
    }

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    // ✅ GETTERS AND SETTERS
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // OPTIONAL: toString() for logging
    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}
