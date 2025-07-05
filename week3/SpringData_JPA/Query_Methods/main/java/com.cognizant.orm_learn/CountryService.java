package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.entity.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountriesByNameContaining(String keyword) {
        return countryRepository.findByNameContaining(keyword);
    }

    public List<Country> getCountriesByNameStartingWith(String prefix) {
        return countryRepository.findByNameStartingWith(prefix);
    }

    public List<Country> getCountriesSortedAsc() {
        return countryRepository.findAllByOrderByNameAsc();
    }

    public List<Country> getCountriesSortedDesc() {
        return countryRepository.findAllByOrderByNameDesc();
    }

    public Country getTopCountry() {
        return countryRepository.findTopByOrderByNameAsc();
    }

    public List<Country> getTop3Countries() {
        return countryRepository.findTop3ByOrderByNameAsc();
    }
}
