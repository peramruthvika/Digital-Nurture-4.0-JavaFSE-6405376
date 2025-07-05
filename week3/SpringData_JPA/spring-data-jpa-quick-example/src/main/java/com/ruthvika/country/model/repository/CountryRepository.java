package com.ruthvika.spring_data_jpa_quick_example.repository;

import com.ruthvika.spring_data_jpa_quick_example.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {}
