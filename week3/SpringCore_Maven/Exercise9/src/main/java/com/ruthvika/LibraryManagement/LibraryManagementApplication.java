package com.ruthvika.LibraryManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryManagementApplication implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementApplication.class, args);
    }

    // ✅ This runs when the app starts
    @Override
    public void run(String... args) {
        bookRepository.save(new Book("Spring in Action", "Craig Walls"));
        bookRepository.save(new Book("Effective Java", "Joshua Bloch"));
        bookRepository.save(new Book("Clean Code", "Robert C. Martin"));
        System.out.println("Dummy data inserted.");
    }
}
