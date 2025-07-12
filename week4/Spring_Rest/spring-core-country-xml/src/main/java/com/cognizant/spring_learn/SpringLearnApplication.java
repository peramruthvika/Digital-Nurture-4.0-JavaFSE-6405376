package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        LOGGER.info("STARTING SPRINGLEARN");
        displayCountry();
        LOGGER.info("ENDING SPRINGLEARN");
    }

    public static void displayCountry() {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml")) {
            Country country = context.getBean("country", Country.class);
            System.out.println("Country = " + country); // Fallback print
            LOGGER.debug("Country: {}", country); // Should print if logger works
        } catch (Exception e) {
            LOGGER.error("Exception loading country bean", e);
        }
    }

}
