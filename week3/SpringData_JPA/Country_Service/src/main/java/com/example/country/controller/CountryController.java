package com.cognizant.orm_learn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.orm_learn.entity.Country;
import com.cognizant.orm_learn.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/{code}")
    public Optional<Country> getCountry(@PathVariable String code) {
        return service.getCountryByCode(code);
    }

    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return service.addCountry(country);
    }

    @PutMapping
    public Country updateCountry(@RequestBody Country country) {
        return service.updateCountry(country);
    }

    @DeleteMapping("/{code}")
    public void deleteCountry(@PathVariable String code) {
        service.deleteCountry(code);
    }

    @GetMapping("/search")
    public List<Country> searchByName(@RequestParam String name) {
        return service.findByPartialName(name);
    }

    @GetMapping
    public List<Country> getAllCountries() {
        return service.getAllCountries();
    }
}
