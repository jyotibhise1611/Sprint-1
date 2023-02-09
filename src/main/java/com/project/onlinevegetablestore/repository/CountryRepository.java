package com.project.onlinevegetablestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.onlinevegetablestore.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
