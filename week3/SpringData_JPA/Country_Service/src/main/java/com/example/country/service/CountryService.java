package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.entity.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    public Optional<Country> getCountryByCode(String code) {
        return repository.findById(code);
    }

    public Country addCountry(Country country) {
        return repository.save(country);
    }

    public Country updateCountry(Country country) {
        return repository.save(country);
    }

    public void deleteCountry(String code) {
        repository.deleteById(code);
    }

    public List<Country> findByPartialName(String namePart) {
        return repository.findByNameContainingIgnoreCase(namePart);
    }

    public List<Country> getAllCountries() {
        return repository.findAll();
    }
}
