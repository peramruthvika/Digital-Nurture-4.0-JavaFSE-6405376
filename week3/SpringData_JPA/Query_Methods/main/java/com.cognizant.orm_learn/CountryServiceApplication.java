public package com.cognizant.orm_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.entity.Country;
import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;

@SuppressWarnings("unused")
@SpringBootApplication
public class CountryServiceApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryServiceApplication.class);
    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CountryServiceApplication.class, args);
        countryService = context.getBean(CountryService.class);

        queryMethodsTest();     }

    

	@SuppressWarnings("unused")
	private static void queryMethodsTest() {
        LOGGER.info("Start Query Methods");

        LOGGER.info("Countries containing 'an': {}", countryService.getCountriesByNameContaining("an"));

        LOGGER.info("Countries starting with 'In': {}", countryService.getCountriesByNameStartingWith("In"));

        LOGGER.info("Countries sorted by name ASC: {}", countryService.getCountriesSortedAsc());

        LOGGER.info("Countries sorted by name DESC: {}", countryService.getCountriesSortedDesc());

        LOGGER.info("Top country by name ASC: {}", countryService.getTopCountry());

        LOGGER.info("Top 3 countries by name ASC: {}", countryService.getTop3Countries());

        LOGGER.info("End Query Methods");
    }

}
 {
    
}
