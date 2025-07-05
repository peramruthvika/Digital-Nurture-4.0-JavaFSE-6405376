package com.ruthvika.spring_data_jpa_quick_example.runner;

import com.ruthvika.spring_data_jpa_quick_example.model.Country;
import com.ruthvika.spring_data_jpa_quick_example.repository.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataRunner implements CommandLineRunner {

    private final CountryRepository repo;

    public DataRunner(CountryRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {
        repo.save(new Country("IN", "India"));
        repo.save(new Country("US", "United States"));

        System.out.println("Countries in DB:");
        repo.findAll().forEach(c ->
            System.out.println(c.getCode() + " - " + c.getName())
        );
    }
}
