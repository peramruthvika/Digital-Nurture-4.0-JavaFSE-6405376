package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountriesByNameContaining(String namePart) {
        return countryRepository.findByNameContainingIgnoreCaseJPQL(namePart);
    }

    public List<Country> getAllCountriesSorted() {
        return countryRepository.findAllOrderedByName();
    }

    public long getCountryCount() {
        return countryRepository.countCountries();
    }

    public List<Country> getCountriesStartingWith(String prefix) {
        return countryRepository.findByNameStartingWithNative(prefix);
    }

    public Country getCountryByExactName(String name) {
        return countryRepository.findByNameNative(name);
    }
}
