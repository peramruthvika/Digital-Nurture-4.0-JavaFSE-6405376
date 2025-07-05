package com.cognizant.orm_learn.repository;

import com.cognizant.orm_learn.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // JPQL/HQL: Find countries where name contains a substring (case-insensitive)
    @Query("SELECT c FROM Country c WHERE LOWER(c.name) LIKE LOWER(CONCAT('%', :namePart, '%'))")
    List<Country> findByNameContainingIgnoreCaseJPQL(String namePart);

    // JPQL/HQL: Find all countries ordered by name
    @Query("FROM Country c ORDER BY c.name")
    List<Country> findAllOrderedByName();

    // HQL with aggregate: Count how many countries exist
    @Query("SELECT COUNT(c) FROM Country c")
    long countCountries();

    // Native Query: Fetch countries starting with specific letter
    @Query(value = "SELECT * FROM country WHERE name LIKE :prefix%", nativeQuery = true)
    List<Country> findByNameStartingWithNative(String prefix);

    // Native Query: Find country by exact name
    @Query(value = "SELECT * FROM country WHERE name = :name", nativeQuery = true)
    Country findByNameNative(String name);
}
