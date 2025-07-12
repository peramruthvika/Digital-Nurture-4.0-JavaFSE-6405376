package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    // Endpoint: GET /countries/{code}
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        LOGGER.info("START: getCountry() for code: {}", code);

        Country country = countryService.getCountry(code);

        if (country != null) {
            LOGGER.info("Country found: {}", country);
        } else {
            LOGGER.warn("Country with code '{}' not found.", code);
        }

        LOGGER.info("END: getCountry()");
        return country;
    }

    // Optional static endpoint to get India by default
    @GetMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("START: getCountryIndia()");
        Country country = countryService.getCountry("IN");
        LOGGER.info("Country (India) returned: {}", country);
        LOGGER.info("END: getCountryIndia()");
        return country;
    }
}
