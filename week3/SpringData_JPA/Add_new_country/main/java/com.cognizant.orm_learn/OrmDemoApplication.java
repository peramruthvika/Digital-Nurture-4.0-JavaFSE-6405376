package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmDemoApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmDemoApplication.class);
    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmDemoApplication
        ApplicationContext context = SpringApplication.run(CountryServiceApplication.class, args);
        countryService = context.getBean(CountryService.class);

        // 🧪 Run test
        testAddCountry(); // 👈 invoke this to test Hands-on 7
    }

    private static void testAddCountry() throws CountryNotFoundException {
        LOGGER.info("Start: testAddCountry");

        Country newCountry = new Country();
        newCountry.setCoCode("FR");
        newCountry.setCoName("France");

        countryService.addCountry(newCountry);

        Country addedCountry = countryService.findCountryByCode("FR");
        LOGGER.debug("Added Country: {}", addedCountry);

        LOGGER.info("End: testAddCountry");
    }
}
