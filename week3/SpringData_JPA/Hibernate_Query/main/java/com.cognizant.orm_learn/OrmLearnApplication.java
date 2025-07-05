package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CountryServiceApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryServiceApplication.class);

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(CountryServiceApplication.class, args);
    }

    @Override
    public void run(String... args) {
        LOGGER.info("JPQL - Countries containing 'in':");
        List<Country> countries = countryService.getCountriesByNameContaining("in");
        countries.forEach(c -> LOGGER.info(c.toString()));

        LOGGER.info("HQL - All countries sorted:");
        countryService.getAllCountriesSorted().forEach(c -> LOGGER.info(c.toString()));

        LOGGER.info("HQL - Country count: " + countryService.getCountryCount());

        LOGGER.info("Native - Countries starting with 'U':");
        countryService.getCountriesStartingWith("U").forEach(c -> LOGGER.info(c.toString()));

        LOGGER.info("Native - Get country by exact name 'India':");
        LOGGER.info(countryService.getCountryByExactName("India").toString());
    }
}
